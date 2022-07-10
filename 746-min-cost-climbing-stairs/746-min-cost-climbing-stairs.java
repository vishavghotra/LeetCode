class Solution {
    public int minCostClimbingStairs(int[] cost) {
         int last = cost[1];
    int secondLast = cost[0];
    for (int i = 2; i < cost.length; i++) {
      int change = last;
      last = Math.min(last, secondLast) + cost[i];
      secondLast = change;

    }
    return Math.min(last, secondLast);
    }
}