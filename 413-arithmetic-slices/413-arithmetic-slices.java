class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
     
        int[] dp=new int[nums.length];
        if(nums.length<3)
            return 0;
        if(nums[1]-nums[0]==nums[2]-nums[1])
            dp[2]=1;
        int result=dp[2];
        for(int i=3;i<nums.length;i++){
            if(nums[i-1]-nums[i-2]==nums[i]-nums[i-1])
                dp[i]=dp[i-1]+1;
            result+=dp[i];
            
        }
        return result;
    }
}