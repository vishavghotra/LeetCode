class Solution {
    public boolean checkPossibility(int[] nums) {
        int number = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        if (number > 0)
          return false;
        else if (i - 1 < 0 || nums[i - 1] <= nums[i + 1]) {
          
            
        }
          else nums[i + 1] = nums[i];
          number++;
      }
    }

    return true;
    }
}