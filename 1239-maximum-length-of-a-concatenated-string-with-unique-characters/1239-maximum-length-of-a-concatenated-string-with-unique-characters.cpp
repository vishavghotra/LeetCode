class Solution {
public:
   int result = 0;
    int maxLength(vector<string> &arr)
    {
        dfs(arr, "", 0);
        return result;
    }
    void dfs(vector<string> &arr, string path, int index)
    {
        if (!unique(path) || index >= arr.size())
        {
            return;
        }
        if (path.length() > result)
            result = path.length();
        for (int i = index; i < arr.size(); i++)
        {
            dfs(arr, path + arr[i], i);
        }
    }
    bool unique(string path)
    {
        vector<int> set(26, 0);
        for (int i = 0; i < path.length(); i++)
        {
            if (set[path[i] - 'a'] > 0)
                return false;
            else
                set[path[i] - 'a']++;
        }
        return true;
    }
};