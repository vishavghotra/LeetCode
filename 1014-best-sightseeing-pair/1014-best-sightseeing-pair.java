class Solution {
    public int maxScoreSightseeingPair(int[] nums) {
      
     int max = 0;
      int  inter = nums[0];
        for(int i = 1; i< nums.length; i++) {
           max = Math.max(nums[i] + inter - i, max);
            if(inter < nums[i] + i)
                inter = nums[i] + i;
            
            
        }
        return max;
    }
}