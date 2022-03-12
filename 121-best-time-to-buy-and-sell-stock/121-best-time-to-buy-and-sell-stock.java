class Solution {
    public int maxProfit(int[] prices) {
        // see first answer kedane's algo
        // different from part 2 because 2 requires full profit, not max difference from any two days
        
       /* int max = Integer.MIN_VALUE;
        int intermax  = 0;
        for(int i = 1; i< prices.length; i++) {
            intermax = Math.max(intermax + prices[i] - prices[i-1], 0) ;
            max= Math.max(max, intermax);
            
        }
        return (max <= 0)?0:max; */
        
        int min =prices[0];
        int max =0;
        for(int i = 1; i< prices.length; i++) {
            if(prices[i] < min) {
                min  = prices[i];
                
            }
            else max= Math.max(prices[i] - min, max);
            
        }
        return max;
     
    }
}