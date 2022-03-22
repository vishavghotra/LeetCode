class Solution {
    public String getSmallestString(int n, int k) {
       char[] result = new char[n];
    for (int i = 0; i < n; i++) {
      result[i] = 'a';
    }
    k -= n;
    n--;
    while (k > 0 && n >= 0) {
      int index = Math.min(25, k);
      result[n--] += index;
      k -= index;
    }
    return String.valueOf(result); 
    }
}