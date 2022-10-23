class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
       vector<int> res{0,0};
        for (int i = 0; i < nums.size(); i++)
        {
            int index = abs(nums[i]) - 1;
            if (nums[index] > 0)
                nums[index] = -nums[index];
            else
                res[0] = index + 1;
        }

        for (int i = 0; i < nums.size(); i++)
        {
            if (nums[i] > 0)
                res[1] = i + 1;
            else
                nums[i] = -nums[i];
        }
        return res;
    }
};