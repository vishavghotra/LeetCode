class Solution {
 public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
    Integer[][][] memo = new Integer[m][n][maxMove + 1];

    return voilate(memo, m, n, maxMove, startRow, startColumn);

  }

  public int voilate(Integer[][][] memo, int m, int n, int maxMove, int startRow, int startColumn) {
    if ((startRow >= m || startColumn >= n || startRow < 0 || startColumn < 0))
      return 1;
    if (maxMove == 0)
      return 0;
    if (memo[startRow][startColumn][maxMove] != null)
      return memo[startRow][startColumn][maxMove];

    int sum = (((voilate(memo, m, n, maxMove - 1, startRow + 1, startColumn)
        + voilate(memo, m, n, maxMove - 1, startRow, startColumn + 1)) % 1000000007
        + voilate(memo, m, n, maxMove - 1, startRow - 1, startColumn)) % 1000000007
        + voilate(memo, m, n, maxMove - 1, startRow, startColumn - 1)) % 1000000007;

    return memo[startRow][startColumn][maxMove] = sum;
  }

}