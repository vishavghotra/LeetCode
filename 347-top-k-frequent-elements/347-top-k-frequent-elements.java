class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         int[] result = new int[k];
    List<Integer>[] bucket = new List[nums.length + 1];
    Map<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for (int i : map.keySet()) {
      int frequency = map.get(i);
      if (bucket[frequency] == null)
        bucket[frequency] = new ArrayList<>();
      bucket[frequency].add(i);
    }
    int count = 0;
    for (int i = nums.length; i >= 1; i--) {
      if (bucket[i] != null) {
        for (int j = 0; j < bucket[i].size() && count < k; j++) {
          result[count++] = bucket[i].get(j);
        }
      }

    }
    return result;
    }
}