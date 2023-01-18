class Solution {
public:
    int maxSubarraySumCircular(vector<int>& nums) {
        int n = nums.size();
    int max_ = nums[0];
    int min_ = nums[0];
    int sum = nums[0];
    int currmax = nums[0];
    int currmin = nums[0];
    for (int i = 1; i < n; i++)
    {
      currmax = max(currmax, 0) + nums[i];
      currmin = min(currmin, 0) + nums[i];
      max_ = max(currmax, max_);
      min_ = min(currmin, min_);
      sum += nums[i];
    }
    return max_ > 0 ? max(max_, sum - min_) : max_;
    }
};