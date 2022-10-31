class Solution {
public:
     
   bool visited[40][40][1609];
    int shortestPath(vector<vector<int>> &grid, int k)
    {
        int m = grid.size();
        int n = grid[0].size();
        int steps = 0;
        queue<vector<int>> queue;
        queue.push({0, 0, k});
        while (!queue.empty())
        {
            int s = queue.size();
            for (int i = 0; i < s; i++)
            {
                auto p = queue.front();
                queue.pop();
                if (p[0] < 0 || p[0] >= m || p[1] >= n || p[1] < 0 || p[2] < 0)
                    continue;
                
                int x = p[0];
                int y = p[1];
                int k = p[2];
                if(visited[x][y][k]) 
                    continue;
                if (x == m - 1 && y == n - 1)
                    return steps;
                visited[x][y][k] = true;
                if (grid[x][y] > 0)
                {
                    k--;
                }
                queue.push({x, y + 1, k});
                queue.push({x, y - 1, k});
                queue.push({x + 1, y, k});
                queue.push({x - 1, y, k});
            }
            steps++;
        }
        return -1;
    }
};