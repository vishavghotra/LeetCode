class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
         Queue<Integer> queue = new PriorityQueue<>();
    int result = 0;
    for (; result < heights.length - 1; result++) {

      int diff = heights[result + 1] - heights[result];
      if (diff <= 0)
        continue;
      if (bricks >= diff) {
        bricks -= diff;
        queue.add(-diff);
      } else if (ladders > 0) {
        if (!queue.isEmpty() && -1 * queue.peek() > diff) {
          bricks += -1 * queue.poll() - diff;
          queue.add(-diff);
        }
        ladders--;
      } else
        break;

    }
    return result;
    }
}