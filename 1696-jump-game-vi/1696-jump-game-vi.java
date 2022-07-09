class Solution {
  public int maxResult(int[] nums, int k) {
    Deque<Integer> dq = new ArrayDeque<>();
    dq.push(0);
    for (int i = 1; i < nums.length; i++) {
        // see maximum sliding window sum: 239
        // look elements in queue as only way to reach at i. Queue stores last k elements in descending order.
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