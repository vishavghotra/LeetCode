class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
	int sum = 0;
	for(int num: nums)
		sum += num;

	if(sum % k != 0)
		return false;

	Arrays.sort(nums);

	return dfs(nums, new int[k], k, nums.length - 1, sum / k);
}

public boolean dfs(int[] nums, int[] sums, int k, int index, int target) {
	if(index < 0)
		return true;

	Set<Integer> seen = new HashSet<>();

	for(int i = 0; i < k; i++) {
		if(sums[i] + nums[index] > target || !seen.add(sums[i]))
			continue;

		sums[i] += nums[index];

		if(dfs(nums, sums, k, index - 1, target))
			return true;

		sums[i] -= nums[index];
	}

	return false;
}
}