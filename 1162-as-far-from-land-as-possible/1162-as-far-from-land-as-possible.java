class Solution {
    
     int[][] directions = new int[][] { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

  public int maxDistance(int[][] grid) {
    Queue<int[]> queue = new LinkedList<>();
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1)
          queue.add(new int[] { i, j });

      }
    }
    if (queue.size() == grid.length * grid[0].length)
      return -1;
    int result = 0;
    while (!queue.isEmpty()) {

      int size = queue.size();
      for (int i = 0; i < size; i++) {
        int[] poll = queue.poll();
        for (int[] dir : directions) {
          int a = poll[0] + dir[0];
          int b = poll[1] + dir[1];
          if (a < 0 || a >= grid.length || b < 0 || b >= grid[0].length || (grid[a][b] != 0))
            continue;
          queue.add(new int[] { a, b });
            grid[a][b] = 1;
        }
      }
      result++;
    }
    return result - 1;
  }
    
}