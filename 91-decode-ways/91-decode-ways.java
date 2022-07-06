class Solution {
    public int numDecodings(String s) {
            /*  if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        for (int i = 2; i <= n; i++) {
            int first = Integer.valueOf(s.substring(i - 1, i));
            int second = Integer.valueOf(s.substring(i - 2, i));
            if (first >= 1) {
               dp[i] += dp[i-1];  
            }
            if (second >= 10 && second <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[n];  */
        
         if (s.charAt(0) == '0')
      return 0;
    int prev = 1;
    int pprev = 1;

    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == '0') { 
        
        prev = 0;    //dp[i-1] not added only dp[i-2] weiter
          
      }
      if (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) < '7')) {
        prev += pprev;
        pprev = prev - pprev;   //calculate last prev from new prev to assign to pprev 
      } else
        pprev = prev;

    }
    return prev;
        
       
        
        
    }
}