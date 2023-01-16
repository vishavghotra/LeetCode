class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {
  vector<vector<int>> result;
    int min_ = newInterval[0];
    int max_ = newInterval[1];

    int n = intervals.size();
    int i = 0;
    while (i < n && intervals[i][1] < min_)
    {
      result.push_back(intervals[i]);
      i++;
    }
    while (i < n && intervals[i][0] <= max_)
    {
      min_ = min(intervals[i][0], min_);
      max_ = max(intervals[i][1], max_);
      i++;
    }
    result.push_back({min_, max_});
    while (i < n)
    {
      result.push_back(intervals[i]);
      i++;
    }
    return result;
    }
};