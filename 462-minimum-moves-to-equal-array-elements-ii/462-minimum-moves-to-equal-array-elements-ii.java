class Solution {
    public int minMoves2(int[] nums) {
        //initution: 1,2,4,6,8,10 :: 
        //convergence: required number between 1 and 10 -> required number between 2 and 8 -> between 4, 6 -> optimal 5   (like recursion)
        // for odd: 1,2,3,4,7,10,11 same until 3, 7 -> then optimal is 5 but we have median = 4.
        //if we move all 3, 7, 4 to 5, total = 4 steps
        // if we move only 3, 7 to 4 total = 4 steps
        // REASON : steps(3,5) = steps(3,4) + steps(4,5). One elements steps reduces in (2) which is added to median in (1)
        // read other articles
	Arrays.sort(nums);
	int operations = 0, mid = nums[nums.length/2];   //
	for (int num: nums) operations += Math.abs(mid - num);
	return operations;
}
}