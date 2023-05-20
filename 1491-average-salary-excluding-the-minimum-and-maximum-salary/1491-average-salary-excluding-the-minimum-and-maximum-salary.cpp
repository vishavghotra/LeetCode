class Solution {
public:
    double average(vector<int> &salary)
  {
    int max_ = salary[0];
    int min_ = salary[0];
    double result = 0;
    for (int i = 1; i < salary.size(); i++)
    {
      if (salary[i] < min_)
      {
        result += (min_ == max_)?0: min_;
        min_ = salary[i];
      }
      else if (salary[i] > max_)
      {
        result += (max_ == min_)?0:max_;
        max_ = salary[i];
      }
      else
        result += salary[i];
    }
    return result / (salary.size() - 2);
  }
};