class Solution {
  public int maxResult(int[] nums, int k) {
    Deque<Integer> dq = new ArrayDeque<>();
    dq.push(0);
    for (int i = 1; i < nums.length; i++) {
         while (!dq.isEmpty() && i - dq.peekFirst() > k)
        dq.pollFirst();
      nums[i] += nums[dq.peekFirst()];
      while (!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) {
        dq.pollLast();
      }
      dq.offerLast(i);
     

    }
    return nums[nums.length - 1];
  }
}