class Solution {
     public static List<String> letterCasePermutation(String s) {
    List<String> result = new ArrayList<>();
    backtrack(s, 0, result, "");
    return result;

  }

  public static void backtrack(String s, int start, List<String> result, String inter) {
    if (inter.length() == s.length()) {
      result.add(inter);
      return;
    }
    {
      if (Character.isLetter(s.charAt(start))) {

        inter += Character.toLowerCase(s.charAt(start));

        backtrack(s, start + 1, result, inter);
        inter = inter.substring(0, inter.length() - 1);

        inter += Character.toUpperCase(s.charAt(start));
        backtrack(s, start + 1, result, inter);
        inter = inter.substring(0, inter.length() - 1);
      } else {
        inter += s.charAt(start);
        backtrack(s, start + 1, result, inter);
        inter = inter.substring(0, inter.length() - 1);
      }
    }
  }
}