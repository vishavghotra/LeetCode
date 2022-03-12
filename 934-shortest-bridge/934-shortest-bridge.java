class Solution {
     public int shortestBridge(int[][] grid) {
    Queue<int[]> queue = new LinkedList<>();
    boolean found = false;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1 && !found) {
          dfs(grid, i, j);
          found = true;
        } else if (grid[i][j] == 1 ) {
          queue.add(new int[] { i, j });
        }

      }
    }
    int result = 0;
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        int[] poll = queue.poll();
        int[][] directions = new int[][] { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        for (int[] dir : directions) {
          int a = poll[0] + dir[0];
          int b = poll[1] + dir[1];
          if (a < 0 || a >= grid.length || b < 0 || b >= grid[0].length || grid[a][b] == 1) {
            continue;
          } else if (grid[a][b] == 2) {
           System.out.println(poll[0] + " " + poll[1]);
              
              return result;
          }
          else {
            grid[a][b] = 1;
          
          queue.add(new int[] { a, b });
          }
        }
          
      }
        result++;

    }
    return -1;

  }

 
  

  public void dfs(int[][] grid , int i , int j) {
if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid [i][j] == 0 || grid[i][j] == 2) {
return;
}
grid[i][j] = 2;
dfs(grid, i+1, j);
dfs(grid, i, j+1);
dfs(grid, i-1, j);
dfs(grid, i, j-1);

      }
}