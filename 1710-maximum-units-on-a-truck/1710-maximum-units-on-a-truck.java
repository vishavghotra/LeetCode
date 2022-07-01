class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
         Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
    int result = 0;
    for (int i = 0; i < boxTypes.length; i++) {
      if (truckSize >= boxTypes[i][0]) {
        result += boxTypes[i][0] * boxTypes[i][1];
        truckSize -= boxTypes[i][0];
      } else {
        result += truckSize * boxTypes[i][1];
        truckSize = 0;
      }
    }
    return result;
    }
}