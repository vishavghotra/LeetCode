class Solution {
    public int minMoves2(int[] nums) {
        //initution: 1,2,4,6,8,10 :: 
        //convergence: required number between 1 and 10 -> required number between 2 and 8 -> between 4, 6 -> optimal 5   (like recursion)
	Arrays.sort(nums);
	int operations = 0, mid = nums[nums.length/2];   //
	for (int num: nums) operations += Math.abs(mid - num);
	return operations;
}
}