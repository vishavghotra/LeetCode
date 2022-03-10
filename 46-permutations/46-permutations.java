class Solution {
     public  List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(0, nums, result, new ArrayList<>());
    return result;

  }

  public  void backtrack(int start, int[] nums, List<List<Integer>> result, List<Integer> add) {
    if (add.size() == nums.length) {
      result.add(new ArrayList<>(add));
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      if (add.contains(nums[i]))
        continue;
      add.add(nums[i]);
      backtrack(0, nums, result, add);
      add.remove(add.size() - 1);
    }
  }

}