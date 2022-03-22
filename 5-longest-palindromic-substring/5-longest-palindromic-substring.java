class Solution {
  public String longestPalindrome(String s) {
  int n = s.length();

    
  boolean[][] dp = new boolean[n][n];
    int index1 = 0; int index2 = 0;
  for (int i = n - 1; i >= 0; i--) {
      dp[i][i] = true;
    for (int j = i + 1; j < n; j++) {
      dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
            
      if (dp[i][j] && (j - i + 1 > index2 - index1 + 1)) {
        index1 = i;
          index2 = j;
      }
    }
  }
    
  return s.substring(index1, index2+1);
}
}