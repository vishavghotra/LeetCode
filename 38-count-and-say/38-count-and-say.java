class Solution {
     public String countAndSay(int n) {
    String result = "1";
    for (int i = 2; i <= n; i++) {
      result = build(result);
    }
    return result;

  }

  public String build(String result) {
    int index = 0;
    String build = "";
    while (index < result.length()) {
      char c = result.charAt(index);
      int count = 0;
      while (index < result.length() && result.charAt(index) == c) {
        index++;
        count++;
      }
      build += count + "" + c;

    }
    return build;

  }
}