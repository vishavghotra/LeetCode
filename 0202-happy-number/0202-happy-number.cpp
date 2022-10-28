class Solution {
public:
    bool isHappy(int n)
    {
        int fast = next(n);
        int slow = n;
        while (fast != 1 && fast != slow)
        {
            slow = next(slow);
            fast = next(next(fast));
        }
        return fast == 1 || fast != slow;
    }
    int next(int n)
    {
        int sum = 0;
        int a = 0;
        while (n > 0)
        {
            a = n % 10;
            sum += a * a;
            n = n / 10;
        }
        return sum;
    }
};