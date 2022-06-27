class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
    /*   int max = startFuel;
    int result = 0;
    int i = 0;
    int n = stations.length;
    Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
    while (max < target) {
      while (i < n && stations[i][0] < max) {
        queue.add(stations[i++][1]);

      }
      if (queue.isEmpty())
        return -1;
      max += queue.poll();
      result++;

    }
    return result;
    }  */
    
    if (startFuel >= target) return 0;
        Queue<Integer> queue = new PriorityQueue<>((a,b) -> b-a);
        int i = 0, n = stations.length, stops = 0, maxDistance = startFuel;
        while (maxDistance < target) {
            while (i < n && stations[i][0] <= maxDistance) {
                queue.offer(stations[i++][1]);
            }
            if (queue.isEmpty()) return -1;
            maxDistance += queue.poll();
            stops++;
        }
        return stops;
}
}