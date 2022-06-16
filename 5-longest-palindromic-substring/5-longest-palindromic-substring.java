class Solution {
    public String longestPalindrome(String s) {
         boolean[][] dp = new boolean[s.length() + 1][s.length() + 1];
    int max = 1;
    String result = s.substring(s.length() - 1);
    for (int i = 0; i < s.length(); i++)
      dp[i][i] = true;
    for (int i = s.length() - 2; i >= 0; i--) {
      for (int j = i + 1; j < s.length(); j++) {
        if (s.charAt(i) == s.charAt(j) && (j == i + 1 || dp[i + 1][j - 1])) {
          dp[i][j] = true;
          if (j - i + 1 > max) {
            result = s.substring(i, j + 1);
            max = j - i + 1;
          }
        }

      }

    }
    return result;
    }
}