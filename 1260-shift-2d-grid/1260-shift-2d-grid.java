class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
         List<List<Integer>> result = new ArrayList<>();
    int m = grid.length;
    int n = grid[0].length;
    int top = m * n - k % (m * n);
    for (int i = top; i < top + m * n; i++) {
      int j = i % (m * n);
      int r = j / n;
      int c = j % n;
      if ((i - top) % n == 0)
        result.add(new ArrayList<Integer>());
      result.get(result.size() - 1).add(grid[r][c]);

    }

    return result;
    }
}