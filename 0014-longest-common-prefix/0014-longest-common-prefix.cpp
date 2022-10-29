class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
       string result = strs[0];
        for (int i = 1; i < strs.size(); i++)
        {
            int pre = 0;
            for (char c : strs[i])
            {
                if (pre < result.size() && c == result[pre])
                {
                    pre++;
                }
                else
                    break;
            }
            result = result.substr(0, pre);
            if (result.size() == 0)
                return result;
        }
        return result;
    }
};