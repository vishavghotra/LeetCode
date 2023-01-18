class Solution {
public:
    int maxSubarraySumCircular(vector<int>& nums) {
        int n = nums.size();
    vector<int> right(n);
    int suffix_sum = nums[n - 1];
    right[n - 1] = suffix_sum;

    for (int i = n - 2; i >= 0; i--)
    {
      suffix_sum += nums[i];
      right[i] = max(suffix_sum, right[i + 1]);
    }
    int prefix_sum = 0;
    int max_sum = nums[0];
    int curr_sum = 0;
    for (int i = 0; i < n; i++)
    {
      prefix_sum += nums[i];
      curr_sum = max(curr_sum, 0) + nums[i];
      max_sum = max(max_sum, curr_sum);
      if (i + 1 < n)
      {
        max_sum = max(max_sum, prefix_sum + right[i + 1]);
      }
    }
    return max_sum;
    }
};