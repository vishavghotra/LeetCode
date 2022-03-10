class Solution {
    public static List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> result = new ArrayList<>();

    backtrack(1, k, n, new ArrayList<>(), result);

    return result;
  }

  public static void backtrack(int index, int k, int n, List<Integer> add, List<List<Integer>> result) {
    if (add.size() == k) {
      result.add(new ArrayList<>(add));
      return;
    }
    for (int i = index; i <= n; i++) {
      add.add(i);
      backtrack(i + 1, k, n, add, result);
      add.remove(add.size() - 1);
    }
  }
}