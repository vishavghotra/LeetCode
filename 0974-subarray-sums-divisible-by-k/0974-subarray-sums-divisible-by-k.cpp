class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
   int n = nums.size();
    if (k <= 1)
      return n;
    map<int, int> map;
    int sum = 0;
    int result = 0;
        map[0] = 1;
    for (int i = 0; i < n; i++)
    {
      sum += nums[i];
      int index = (sum < 0) ? k - ((-sum % k == 0) ? k: (-sum % k)) : sum % k;

      
      result += map[index];
        map[index]++;
    }
    return result;
    }
};