class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
    Deque<Integer> deque = new LinkedList<>();
    int[] result = new int[nums.length - k + 1];
    int index = 0;
    // in this deque a maximum element is on top because of second condition. Deque
    // is first in, first out.
    for (int i = 0; i < nums.length; i++) {
      while (!deque.isEmpty() && i - deque.peek() >= k) // we remove all maximums, which are not in range within k.
        deque.poll(); // start from above because element lesser cannot be below.It would have already
                      // been removed by other maximum
      // we are at 4 and want to attach it.
      // example : 1,2,3,4 k = 2 while at 4 and we start at first element. 1 cannot
      // survive because its eliminated by 2, which is then
      // eliminated by 3

      // example: 5,2,3,4: here 5 survives because its maximum and stays at top
      // because of second while loop which attaches all
      // other elements (2, 3) under 5. So we start always at maximum(first element).
      // wich means if first element is in range (<= k) for example at index x, it has
      // already eliminated all
      // elements < x )

      while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {// this removes all number lesser than current and
                                                               // maintains descending order
        //
        deque.pollLast();    // check from last 
      } //
      deque.offer(i);
      if (i >= k - 1)
        result[index++] = nums[deque.peek()];

    }
    return result;

  }
}