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
      int index = sum % k;
        index = index < 0 ? k + index: index;

      
      result += map[index];
        map[index]++;
    }
    return result;
    }
};