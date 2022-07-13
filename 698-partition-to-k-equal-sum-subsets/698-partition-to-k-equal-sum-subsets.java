class Solution {
   /*  public boolean canPartitionKSubsets(int[] nums, int k) {
	if (k > nums.length) return false;
	int sum = 0;
	for (int i : nums) sum += i;
	// basic logic test
	if (sum % k != 0) return false;
	Arrays.sort(nums);

	return dfs(nums, new boolean[nums.length], k, 0, sum / k, nums.length - 1);
}

private boolean dfs(int[] nums, boolean[] visited, int k, int currentSum, int targetSum, int position) {
	// if k is 0, for sure nothing will be left unvisited! this is conclusion from simple math.
	if (k == 1) return true;

	// begin next sum search. Critical point: start search from nums.length - 1, not position!!!
	if (currentSum == targetSum) return dfs(nums, visited, k - 1, 0, targetSum, nums.length - 1);

	for (int i = position; i >= 0; i--) {
		// Skip logic 1: 
		// Of course you cannot visit what's already visited.
		if (visited[i]) continue;
		// Skip logic 2:
		// if the last position (i + 1) is not visited, that means it does not work for current combination, 
		// and of course this position (i) has same value, it won't work as well, skip it.
		if (i + 1 < nums.length && nums[i] == nums[i + 1] && !visited[i + 1]) continue;
		// Skip logic 3:
		// No need to explain, just out of range case.
		if (currentSum + nums[i] > targetSum) continue;

		// simple recursion and backtracking
		visited[i] = true;
		if (dfs(nums, visited, k, currentSum + nums[i], targetSum, i - 1)) return true;
		visited[i] = false;
	}
	return false;
}

*/
    
    
    public boolean canPartitionKSubsets(int[] nums, int k) {
    int sum = 0;
    for (int num : nums)
      sum += num;
    if (sum % k != 0)
      return false;
    Arrays.sort(nums);
    return can(nums, new int[k], nums.length - 1, k, sum / k);

  }

  public boolean can(int[] nums, int[] sum, int index, int k, int target) {
    if (index == -1) {
      for (int num : sum) {
        if (num != target)
          return false;
      }
      return true;
    }
    for (int i = 0; i < k; i++) {
      if (sum[i] + nums[index] > target) {
        continue;
      }

      int j = i - 1;
      while (j >= 0) {
        if (sum[i] == sum[j])
          break;
        else
          j--;
      }
      if (j != -1)
        continue;
      sum[i] += nums[index];
      if (can(nums, sum, index - 1, k, target))
        return true;
      sum[i] -= nums[index];

    }
    return false;

  }
}