class Solution {
    public int maxProfit(int[] prices) {
        // see first answer kedane's algo
        
        int max = Integer.MIN_VALUE;
        int intermax  = 0;
        for(int i = 1; i< prices.length; i++) {
            intermax = Math.max(intermax + prices[i] - prices[i-1], prices[i] - prices[i-1]) ;
            max= Math.max(max, intermax);
            
        }
        return (max <= 0)?0:max;
     
    }
}