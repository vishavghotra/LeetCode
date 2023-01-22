class Solution {
public:
    vector<vector<string>> partition(string s) {
      vector<vector<string>> result;
    vector<string> inter;
    vector<vector<int>> dp(s.size(), vector<int>(s.size()));
    dfs(s, result, 0, inter, dp);
    return result;
  }
  void dfs(string s, vector<vector<string>> &result, int index, vector<string> &inter, vector<vector<int>> &dp)
  {
    if (index >= s.length())
    {
      result.push_back(inter);
      return;
    }
    for (int i = index; i < s.length(); i++)
    {
      if (s[i] != s[index])
        continue;
      if (i - index > 2 && dp[index + 1][i - 1] != 1)
        continue;
      dp[index][i] = 1;

      inter.push_back(s.substr(index, i - index + 1));
      dfs(s, result, i + 1, inter, dp);
      inter.pop_back();
    }
  }
};