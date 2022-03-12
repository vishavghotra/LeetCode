class Solution {
    public int maxProduct(int[] nums) {
    int maxSum = nums[0];
int currentMax = nums[0];
int currentMin = nums[0];

for (int i = 1; i < nums.length; i++) {
    if (nums[i] < 0){
        int tmp = currentMax;
        currentMax = currentMin;
        currentMin = tmp;
    }

    currentMax = Math.max(nums[i], currentMax * nums[i]);
    currentMin = Math.min(nums[i], currentMin * nums[i]);
    maxSum = Math.max(maxSum, currentMax);
}
return maxSum;
    }
}