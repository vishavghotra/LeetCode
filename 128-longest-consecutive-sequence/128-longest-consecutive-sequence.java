class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
    for (int num : nums)
      set.add(num);
    int current = 0;
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (!set.contains(nums[i] - 1)) {
        current = 1;
        int word = nums[i] + 1;
        while (set.contains(word)) {
          current++;
          word++;
        }
        max = Math.max(current, max);
      }
    }
    return max;
    }
}