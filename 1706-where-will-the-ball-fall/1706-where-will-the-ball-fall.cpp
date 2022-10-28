class Solution {
public:
   vector<int> findBall(vector<vector<int>> &grid)
    {
        vector<int> result;
        for (int i = 0; i < grid[0].size(); i++)
        {
            result.push_back(helper(grid, 0, i));
        }
        return result;
    }
    int helper(vector<vector<int>> &grid, int x, int y)
    {
        if (x >= grid.size())
            return y;
        if (grid[x][y] == 1 && (y == grid[0].size() - 1 || grid[x][y + 1] != 1))
            return -1;
        if (grid[x][y] == -1 && (y == 0 || grid[x][y - 1] != -1))
            return -1;
        if (grid[x][y] == 1)
            return helper(grid, x + 1, y + 1);
        else
            return helper(grid, x + 1, y - 1);
    }
};