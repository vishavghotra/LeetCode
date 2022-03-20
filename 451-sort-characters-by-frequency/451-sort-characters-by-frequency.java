class Solution {
     public String frequencySort(String s) {
    List<Character>[] bucket = new List[s.length() + 1];
    Map<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for (char c : map.keySet()) {
      int frequency = map.get(c);
      if (bucket[frequency] == null) {
        bucket[frequency] = new ArrayList<>();
      }
      bucket[frequency].add(c);

    }
    String result = "";
    for (int i = s.length(); i >= 1; i--) {
      if (bucket[i] != null) {
        for (int j = 0; j < bucket[i].size(); j++) {
          int k = 0;
          while (k != i) {
            result += bucket[i].get(j);
            k++;
          }
        }
      }

    }
    return result;

  }

}