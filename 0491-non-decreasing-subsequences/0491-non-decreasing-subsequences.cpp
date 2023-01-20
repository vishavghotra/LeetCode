class Solution {
public:
    vector<vector<int>> findSubsequences(vector<int>& nums) {
     vector<vector<int>> result;
    vector<int> inter;

    dfs(inter, 0, nums, result);


    return result;
  }
  void dfs(vector<int> &inter, int index, vector<int> &nums, vector<vector<int>> &result)
  {
    if (index >= nums.size())
    {
      return;
    }
      set<int> store;
    for (int i = index; i < nums.size(); i++)
    {
       if(store.find(nums[i]) != store.end()) continue;
      if (inter.size() == 0)
      {
        inter.push_back(nums[i]);
       // result.push_back(inter);
        dfs(inter, i + 1, nums, result);
        inter.pop_back();
      }
      else
      {
        if (nums[i] >= inter.back())
        {
          inter.push_back(nums[i]);
          result.push_back(inter);
          dfs(inter, i + 1, nums, result);
          inter.pop_back();
        }
          
      }
        store.insert(nums[i]);
    }
  }
};