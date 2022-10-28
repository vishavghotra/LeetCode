class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> result;
        map<string, vector<string>> map;
        for (int i = 0; i < strs.size(); i++)
        {
            string s = strs[i];
            sort(strs[i].begin(), strs[i].end());
            map[strs[i]].push_back(s);
        }
        for (auto m : map)
        {
            result.push_back(m.second);
        }
        return result;
    }
};