class Solution {
public:
    string countAndSay(int n)
    {
        if(n == 1) return "1";
        else return say(countAndSay(n-1));
    }
    string say(string s)
    {
        string result = "";
        for (int i = 0; i < s.length(); i++)
        {
             int count = 1;
            char inter = s[i];
            while (i < s.length() - 1 && s[i] == s[i + 1])
            {
                count++;
                i++;
            }
            result += to_string(count) + inter;
        }
        return result;
    }
};