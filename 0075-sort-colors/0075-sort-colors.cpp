class Solution {
public:
    void sortColors(vector<int>& nums) {
        int low = 0;
        int high = nums.size() - 1;
        int zero = 0;
        while (low <= high)
        {
            if (nums[low] == 2)
            {

                nums[low] = nums[high];
                nums[high] = 2;
                high--;
            }
            else if (nums[low] == 0)
            {

                nums[low] = nums[zero];
                nums[zero] = 0;
                zero++;
                low++;
            }
            else low++;
        }
    }
};