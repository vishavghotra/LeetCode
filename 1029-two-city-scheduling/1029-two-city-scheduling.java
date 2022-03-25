class Solution {
    public int twoCitySchedCost(int[][] costs) {
         int sum = 0;
   Arrays.sort(costs, (a,b) -> ((b[0] - b[1]) - (a[0] - a[1])));
   for(int i = 0; i < costs.length/2; i++) {
   sum += costs[i][1];
   }
   for(int i = costs.length/2; i < costs.length; i++) {
     sum += costs[i][0];
   }
   return sum;
    }
}