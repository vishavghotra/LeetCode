class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
         int result = 0;
    Queue<int[]> queue = new LinkedList<>();
    queue.add(entrance);
        maze[entrance[0]][entrance[1]] = '+';
    while (!queue.isEmpty()) {
      int size = queue.size();
        result++;
      for (int i = 0; i < size; i++) {
        int[] poll = queue.poll();
        int[][] directions = new int[][] { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        for (int[] dir : directions) {
          int a = poll[0] + dir[0];
          int b = poll[1] + dir[1];
          if (a < 0 || a >= maze.length || b < 0 || b >= maze[0].length || maze[a][b] == '+') {
            continue;
          }
          if (a == 0 || a == maze.length - 1 || b == 0 || b == maze[0].length - 1)
            return result;

          if (maze[a][b] == '.') {
            queue.add(new int[] { a, b });
            maze[a][b] = '+';
          }
        }

      }
     
    }
    return -1;
    }
}