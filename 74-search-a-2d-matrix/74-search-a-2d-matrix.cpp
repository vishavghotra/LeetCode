class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int s = matrix.size();
        int se = matrix[0].size();
        for (int i = s - 1; i >= 0; i--)
        {
            if (matrix[i][0] <= target)
            {
                int l = 0;
                int h = se - 1;
                while (l <= h)
                {
                    int mid = l + (h - l) / 2;
                    if (matrix[i][mid] == target)
                        return true;
                    else if (matrix[i][mid] < target)
                        l = mid + 1;
                    else
                        h = mid - 1;
                }
                return false;
            }
        }
        return false;
    }
};