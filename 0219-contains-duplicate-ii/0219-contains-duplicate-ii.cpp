class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        map<int, int> map;
        for (int i = 0; i < nums.size(); i++)
        {
            if (map[nums[i]] == 0)
            {
                if (nums[0] != nums[i] || i == 0)
                    map[nums[i]] = i;
                else if (i <= k)
                    return true;
                else map[nums[i]] = i;
            }
            else if (i - map[nums[i]] <= k)
                return true;
            else map[nums[i]] = i;
        }
        return false;
    }
};