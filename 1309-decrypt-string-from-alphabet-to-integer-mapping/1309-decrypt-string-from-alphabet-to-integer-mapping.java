class Solution {
    public String freqAlphabets(String s) {
        String result = "";
    HashMap<String, Character> map = new HashMap<>();
    int k = 1;
    for (char ch = 'a'; ch <= 'z'; ch++) {
      if (ch < 'j')
        map.put(String.valueOf(k++), ch);
      else
        map.put(String.valueOf(k++) + "#", ch);
    }
    for (int i = 0; i < s.length(); i++) {

      if (i + 3 <= s.length()) {
        if (map.containsKey(s.substring(i, i + 3))) {
          result += map.get(s.substring(i, i + 3));
            i += 2;
        } else
          result += map.get(s.substring(i, i+1));
      } else
        result += map.get(s.substring(i, i + 1));

    }
    return result;
    }
}