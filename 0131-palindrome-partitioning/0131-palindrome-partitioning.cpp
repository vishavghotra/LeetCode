class Solution {
public:
    vector<vector<string>> partition(string s) {
     vector<vector<string>> result;
    vector<string> inter;
    dfs(s, result, 0, inter);
    return result;
  }
  void dfs(string s, vector<vector<string>> &result, int index, vector<string> &inter)
  {
    if (index >= s.length())
    {
      result.push_back(inter);
      return;
    }
    for (int i = index; i < s.length(); i++)
    {
      if (i == index || isPalindrome(s, index, i))
      {
        inter.push_back(s.substr(index, i - index + 1));
        dfs(s, result, i + 1, inter);
        inter.pop_back();
      }
    }
  }
  bool isPalindrome(string s, int i, int j)
  {

    while (i < j)
    {
      if (s[i++] != s[j--])
        return false;
    }

    return true;
  }
};