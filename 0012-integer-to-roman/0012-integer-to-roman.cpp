class Solution {
public:
    string intToRoman(int num) {
        string result;
        string roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int val[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; num != 0;)
        {
            if (num >= val[i])
            {
                num -= val[i];
                result += roman[i];
            }
            else
                i++;
        }
        return result;
    }
};