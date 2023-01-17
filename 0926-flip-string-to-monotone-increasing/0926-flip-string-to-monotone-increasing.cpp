class Solution {
public:
    int minFlipsMonoIncr(string s) {
        int one = 0;
    int zero = 0;
    for (int i = 0; i < s.size(); i++)
    {
      if (s[i] == '0')
        zero++;
    }
    int ans = zero;
    for (int i = 0; i < s.size(); i++)
    {
      if (s[i] == '1')
        zero++;
      else
      {
        zero--;
      }
      ans = min(ans, zero );
    }
    return ans;
    }
};