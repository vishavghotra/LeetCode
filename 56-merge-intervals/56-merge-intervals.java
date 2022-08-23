class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    int start = intervals[0][0];
    int end = intervals[0][1];
    List<int[]> map = new ArrayList<>();
    for (int i = 1; i < intervals.length; i++) {
      if (end >= intervals[i][0])
        end = Math.max(intervals[i][1], end);
      else {
        map.add(new int[] { start, end });
        start = intervals[i][0];
        end = intervals[i][1];

      }
    }
    map.add(new int[] { start, end });
    int[][] result = new int[map.size()][2];
    for (int i = 0; i < map.size(); i++) {
      result[i] = map.get(i);

    }
    return result;
    }
}