class Solution {
     public void nextPermutation(int[] nums) {
    int last = nums.length - 1;
    while (last > 0 && nums[last] <= nums[last - 1])
      last--;
    if (last == 0) {
      reverse(nums, 0);
      return;
    } else {
      last--;
      int max = last + 1;

      for (int i = last + 1; i < nums.length; i++) {
        if (nums[i] > nums[last]  /*nums[i] <= nums[max]*/) {
          max = i;
        }
      }
      int swap = nums[max];
      nums[max] = nums[last];
      nums[last] = swap;
      reverse(nums, last + 1);
      return;
    }

  }

  public void reverse(int[] nums, int start) {
    int end = nums.length - 1;
    int replace = 0;
    while (start < end) {
      replace = nums[start];
      nums[start++] = nums[end];
      nums[end--] = replace;

    }

  }
}