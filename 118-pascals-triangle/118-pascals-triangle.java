class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> result = new ArrayList<>();
    List<Integer> add = new ArrayList<>();
    add.add(1);
    result.add(add);
        add = new ArrayList<>();
    for (int i = 1; i < numRows; i++) {
      add.add(1);

      for (int j = 1; j < i; j++) {
        add.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
      }
      add.add(1);
      result.add(add);
      add = new ArrayList<>();
    }
    return result;
    }
}