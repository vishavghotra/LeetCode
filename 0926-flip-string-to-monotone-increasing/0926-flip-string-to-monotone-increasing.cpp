class Solution {
public:
    int minFlipsMonoIncr(string s) {
   int flips = 0;
    int one = 0;
    for (char c : s)
    {
      if (c == '1')
      {
        one++;
      }
      else
      {
        flips = min(flips + 1, one);
      }
    }
    return flips;
    }
};