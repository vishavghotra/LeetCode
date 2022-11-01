class Solution {
public:
    bool isToeplitzMatrix(vector<vector<int>>& matrix) {
        int n = matrix[0].size();
        int m = matrix.size();
        for (int i = 0; i < matrix[0].size(); i++)
        {
            int curr = matrix[0][i];
            int x = 0;
            int y = i;
            while (x < m && y < n && matrix[x][y] == curr)
            {
                x++;
                y++;
            }
          if (x < m && y < n)
                return false;
        }
        for (int i = 1; i < m; i++)
        {
            int curr = matrix[i][0];
            int x = i;
            int y = 0;
            while (x < m && y < n && matrix[x][y] == curr)
            {
                x++;
                y++;
            }
        if (x < m && y < n)
                return false;
        }
        return true;
    }
};