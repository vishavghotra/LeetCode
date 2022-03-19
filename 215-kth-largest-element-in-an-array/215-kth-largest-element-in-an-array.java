class Solution {
     public  int findKthLargest(int[] nums, int k) {
    return partition(nums, 0, nums.length - 1, nums.length - k);

  }

  public  int partition(int[] nums, int start, int end, int k) {
    int replace = start;
    int right = end;
    int pivot = nums[start];
    while (start <= end) {
      while (start <= end && nums[start] <= pivot)
        start++;
      while (start <= end && nums[end] > pivot)
        end--;
      if (start > end)
        break;
      int temp = nums[end];
      nums[end] = nums[start];
      nums[start] = temp;

    }

    int temp = nums[end];
    nums[end] = pivot;
    nums[replace] = temp;
    if (k == end)
      return nums[end];
    else if (k > end) {
      return partition(nums, end + 1, right, k);
    } else
      return partition(nums, replace, end - 1, k);

  }

}