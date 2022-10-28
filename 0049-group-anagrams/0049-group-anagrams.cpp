class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
       vector<vector<string>> result;
        map<string, vector<string>> map;
        for (int i = 0; i < strs.size(); i++)
        {
            string s =
                stringsort(strs[i]);
            map[s].push_back(strs[i]);
        }
        for (auto m : map)
        {
            result.push_back(m.second);
        }
        return result;
    }
    string stringsort(string s)
    {
        int counter[26] = {0};
        for (char c : s)
        {
            counter[c - 'a']++;
        }
        string result;
        for (int i = 0; i < 26; i++)
        {
            result.push_back(counter[i]);
        }
        return result;
    }
};