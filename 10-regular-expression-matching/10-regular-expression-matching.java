class Solution {
    public boolean isMatch(String s, String p) {
      int m = s.length() + 1;
    int n = p.length() + 1;
    boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
    dp[0][0] = true;
    for (int i = 2; i < n; i++) {
      if (p.charAt(i-1) == '*' && dp[0][i - 2]) {
        dp[0][i] = true;
      }
    }
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '.') {
          dp[i][j] = dp[i - 1][j - 1];
        } else {
          if (p.charAt(j - 1) == '*') {
            if (p.charAt(j - 2) != s.charAt(i - 1) && p.charAt(j - 2) != '.')
              dp[i][j] = dp[i][j - 2];
            else {
              dp[i][j] = dp[i][j - 2] || dp[i - 1][j - 1] || dp[i - 1][j];
            }
          }
        }
      }

    }
    return dp[m-1][n-1];  
    }
}