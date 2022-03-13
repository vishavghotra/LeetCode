public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if (n == 0)
      return 0;
    int total = 0;
    int result = 0;
    while (n != 0) {

      int bit = (n % 2 == 0) ? 0 : 1;
      result = (result << 1) + bit;
      n = n >>> 1;
      total++;
    }
    for (int i = total; i < 32; i++) {
      result = result << 1;
    }
    return result;
    }
}