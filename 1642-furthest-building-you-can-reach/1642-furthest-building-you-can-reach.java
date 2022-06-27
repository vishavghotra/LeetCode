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
    
    /*
    SEE LEE SOLUTION AND MADNO COMMENT : MIN HEAP: LADDERS FIRST, THEN POP LOWEST FROM HEAP TO ADD WITH BRICKS(LOWEST BRICKS POSSIBLE) ; MAX HEAP: BRICKS FIRST
    
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

	for (int i=0; i<heights.length-1; i++) {
		if (heights[i] >= heights[i+1]) continue;
		bricks -= heights[i+1] - heights[i];
		pq.add(heights[i+1] - heights[i]);

		if (bricks < 0) {
			bricks += pq.poll();
			if (ladders > 0) ladders--;
			else return i;
		}
	}

	return heights.length - 1;
    
    
    
    */
}