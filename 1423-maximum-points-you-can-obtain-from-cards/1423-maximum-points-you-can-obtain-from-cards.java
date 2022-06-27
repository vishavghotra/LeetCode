class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int right = 0;
    int left = 0;
    int max = 0;
    for (int i = 0; i < k; i++) {
      left += cardPoints[i];
    }
    max = left;
    for (int i = 0; i < k; i++) {
      left -= cardPoints[k - 1 - i];
      right += cardPoints[cardPoints.length - 1 - i];
      max = Math.max(left + right, max);

    }
    return max;
    }
}