class Solution {
    public String longestPalindrome(String s) {
        
        
       int n = s.length(), start = 0, end = 0;
	boolean[][] dp = new boolean[n][n];

	for (int len=0; len<n; len++) {
		for (int i=0; i+len<n; i++) {
			dp[i][i+len] = s.charAt(i) == s.charAt(i+len) && (len < 2 || dp[i+1][i+len-1]);
			if (dp[i][i+len] && len > end - start) {
				start = i;
				end = i + len;
			}
		}
	}

	return s.substring(start, end + 1); 
        
        
        
        
        
        
        
        
    /*     boolean[][] dp = new boolean[s.length() + 1][s.length() + 1];
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
    return result;*/
    }
}