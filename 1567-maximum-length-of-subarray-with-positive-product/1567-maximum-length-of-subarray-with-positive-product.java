class Solution {
    public int getMaxLen(int[] nums) {
       int positive =0 ;
        int negative =0 ;
        int result = 0;
        for(int i = 0; i< nums.length; i++) {
            if(nums[i] > 0) {
                positive = positive + 1;
                negative = (negative == 0) ? 0: negative + 1;
                
            }
            else if(nums[i] < 0 ){
                int temp = positive;
                positive = (negative == 0)?0:negative + 1;
                negative = temp + 1;
                
            }
            else {
                positive = 0;
                negative = 0;
            }
            result = Math.max(positive, result);
            
            
        }
        return result;
    }
}