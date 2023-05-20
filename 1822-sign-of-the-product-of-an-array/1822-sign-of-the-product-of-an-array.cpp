class Solution {
public:
    int arraySign(vector<int> &nums)
  {
    int result = 1;
    for (int i = 0; i < nums.size(); i++)
    {
      result *= ((nums[i] > 0) ? 1 : (nums[i] == 0) ? 0
                                                    : -1);
      if (result == 0)
        return 0;
    }
    return result;
  }
};