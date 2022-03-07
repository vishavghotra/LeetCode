class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int max = 0;
        int[] dp = new int[cost.length];
        
        if(cost.length == 1)
            return cost[0];
        else if(cost.length == 2)
            return Math.min(cost[0],cost[1]);
        
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        for(int i = 2;i<cost.length;i++){
            if(dp[i-1] < dp [i-2])
                dp[i] = dp[i-1] + cost[i];
            else dp[i] = dp[i-2] + cost[i];
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }
}