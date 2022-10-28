class Solution {
public:
    set<int> contain;
    bool isHappy(int n)
    {
        if (contain.find(n) != contain.end())
            return false;
        contain.insert(n);
        int sum = 0;
        int a = 0;
        while (n != 0)
        {
            a = n % 10;
            sum += a * a;
            n = n / 10;
        }
        if (sum == 1)
            return true;
        else
        {
            return isHappy(sum);
        }
    }
};