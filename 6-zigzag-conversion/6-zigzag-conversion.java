class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
      return s;
    StringBuilder[] result = new StringBuilder[numRows];
    for (int i = 0; i < numRows; i++)
      result[i] = new StringBuilder();
    int count = 0;
    int counter = 0;
    while (counter < s.length()) {
      while (counter < s.length() && count < numRows) {
        result[count++].append(s.charAt(counter++));
      }
      count = numRows - 2;
      while (counter < s.length() && count >= 1) {
        result[count--].append(s.charAt(counter++));
      }
      count = 0;

    }
    String res = "";
    for (int i = 0; i < numRows; i++)
      res += result[i].toString();
    return res;
    }
}