class Solution {
  public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
  int maxH = 0;
  int maxV = 0;
  Arrays.sort(horizontalCuts);
  Arrays.sort(verticalCuts);
  maxH = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length  - 1]);
  maxV = Math.max(verticalCuts[0],w - verticalCuts[verticalCuts.length - 1]);
for(int i = 0; i < horizontalCuts.length - 1; i++) {

  maxH = Math.max(maxH, horizontalCuts[i + 1] - horizontalCuts[i] );

}
for(int i = 0; i < verticalCuts.length - 1; i++) {
  maxV = Math.max(maxV, verticalCuts[i + 1] - verticalCuts[i]);
}
return (int)((long)maxH * maxV % 1000000007);
  }
}