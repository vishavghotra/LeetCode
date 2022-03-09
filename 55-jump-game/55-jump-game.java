class Solution {
    public boolean canJump(int[] nums) {
    int dis = 0;
     
    
    for(int i=0;i<nums.length ; i++){
     if(dis< i) return false;
        dis = Math.max(i+nums[i],dis);
        if(dis >= nums.length-1)
            return true;
       
        
        
    }
        
    return false;
}
}