class Solution {
    public int maximumUniqueSubarray(int[] nums) {
         int start = 0;

    int sum = 0;
    int max = 0;
    int[] store = new int[10001];

    for (int i = 0; i < nums.length; i++) {
      if (store[nums[i]] != 0) {


        while (nums[start] != nums[i]) {
          store[nums[start]]--;
          sum -= nums[start++];

        }
        start++;

      } else {
        store[nums[i]]++;
        sum += nums[i];
        max = Math.max(sum, max);

      }

    }
    return max;

    }
}