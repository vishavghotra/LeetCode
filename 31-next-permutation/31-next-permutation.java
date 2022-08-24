class Solution {
     public void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;

  }

  public void reverseSort(int[] nums, int index) {
    int low = index;
    int high = nums.length - 1;
    while (low < high) {
      swap(nums, low, high);
      low++;
      high--;

    }

  }

  public void nextPermutation(int[] nums) {
    int n = nums.length - 1;
    int index = n;
    while (index > 0) {
      if (nums[index - 1] < nums[index])
        break;
      index--;
    }
    index--;
    if (index == -1) {
      reverseSort(nums, 0);
      return;
    }
    int pointer = index + 1;
    while (pointer <= n && nums[pointer] > nums[index])
      pointer++;
    pointer--;
    swap(nums, pointer, index);
    reverseSort(nums, index + 1);
  }
}