class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int s = matrix.size();
        int se = matrix[0].size();
        int l = 0;
        int h = s - 1;

        while (l <= h)
        {
            int mid = l + (h - l) / 2;
            if (matrix[mid][0] == target)
                return true;
            else if (matrix[mid][0] < target)
            {
                int le = 0;
                int he = se - 1;
                while (le <= he)
                {
                    int mide = le + (he - le) / 2;
                    if (matrix[mid][mide] == target)
                        return true;
                    else if (matrix[mid][mide] < target)
                        le = mide + 1;
                    else
                        he = mide - 1;
                }
                l = mid + 1;
            }
            else
                h = mid - 1;
        }
        return false;
       
    }
};