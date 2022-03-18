class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    int m = triangle.size();
    if (m == 0) return 0;
    int n = triangle.get(m - 1).size();
    if (n == 0) return 0;
    int[] dp = new int[m];
    dp[0] = triangle.get(0).get(0);
    for (int i = 1; i < m; i++) {
       
        for (int k = i; k >= 0; k--) {
          if(k == i) {
              dp[k] = dp[k-1] + triangle.get(i).get(k);
          }
            else if(k == 0) {
                dp[k] = dp[0] + triangle.get(i).get(k);
                
            }
            else dp[k] = Math.min(dp[k-1], dp[k]) + triangle.get(i).get(k);
        }
    }
    int min = Integer.MAX_VALUE;
    for (int k = 0; k < n; k++) {
        min = Math.min(min, dp[k]);
    }
    return min;
}
}