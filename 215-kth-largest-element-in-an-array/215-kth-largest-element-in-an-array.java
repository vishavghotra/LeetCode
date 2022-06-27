class Solution {
     public int findKthLargest(int[] nums, int k) {
    return partition(0, nums.length - 1, nums, nums.length - k);
  }

  public int partition(int start, int end, int[] nums, int k) {
    if (start > end)
      return Integer.MAX_VALUE;
    int pivot = nums[end];
    int left = start;
    for (int i = start; i < end; i++) {
      if (nums[i] < pivot)
        exch(nums, left++, i);

    }
    exch(nums, left, end );
    if (left == k)
      return nums[left];
    else if (left < k)
      return partition(left + 1, end, nums, k);
    else
      return partition(start, left - 1 , nums, k);

  }

  public void exch(int[] nums, int i, int j) {
    int ex = nums[i];
    nums[i] = nums[j];
    nums[j] = ex;

  }


}