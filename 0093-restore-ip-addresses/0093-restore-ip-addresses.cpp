class Solution {
public:
    vector<string> restoreIpAddresses(string s) {
        
    vector<string> result;
    dfs(s, 0, result, 0, "");
    return result;
  }
 
  void dfs(string s, int index, vector<string> &result, int section, string restore)
  {
    if (index >= s.length())
    {
      if (section == 4)
      {

        result.push_back(restore);
      }
      return;
    }
    if (section > 4)
      return;
    int n = s.size();
    for (int i = 1; i < 4; i++)
    {
      if (index + i > n)
        continue;
      string inter = s.substr(index, i);
      if ((s[index] == '0' && inter.length() > 1) || stoi(inter) > 255)
        continue;
      dfs(s, index + i, result, section + 1, restore + inter + ((section == 3) ? "" : "."));
    }
  }
};