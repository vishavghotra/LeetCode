class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       
        int summin = 0;
        int summax = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int totalsum = 0;
        for(int i = 0;i<nums.length ; i++){
            summax = Math.max(summax + nums[i] , nums[i]);
            max = Math.max(summax , max);
            
            summin = Math.min(summin + nums[i] , nums[i]);
            min = Math.min(min , summin);
            totalsum += nums[i];
        }
        return (totalsum == min)?max : Math.max(totalsum - min , max);
        
    }
}