class Solution {
    public int rob(int[] nums) {
	   if(nums.length==0)
		   return 0;
	   if(nums.length==1)
		   return nums[0];
	   if(nums.length==2)
		   return Math.max(nums[0],nums[1]);
	   if(nums.length==3)
		   return Math.max(nums[0], Math.max(nums[1], nums[2]));
	   return Math.max(calculate(nums,0,nums.length-2),calculate(nums,1,nums.length-1));
	   
   }
   
   public int calculate(int[] nums,int start,int end) {
	 int prevmax=0;
       int currmax=0;
       for(int i=start;i<=end;i++){
           int t=currmax;
           currmax=Math.max(prevmax+nums[i],currmax);
           prevmax=t;
           
       }
       return currmax;
	   
   }
}