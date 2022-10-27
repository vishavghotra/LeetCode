class Solution {
public:
    int largestOverlap(vector<vector<int>>& img1, vector<vector<int>>& img2) {
        vector<pair<int, int>> a;
        vector<pair<int, int>> b;
        for (int i = 0; i < img1.size(); i++)
        {
            for (int j = 0; j < img2.size(); j++)
            {
                if (img1[i][j] == 1)
                    a.push_back({i, j});
                if (img2[i][j] == 1)
                    b.push_back({i, j});
            }
        }
        map<pair<int, int>, int> map;
        for (auto p : a)
        {
            for (auto q : b)
            {
                map[{p.first - q.first, p.second - q.second}]++;
            }
        }
        int result = 0;
        for (auto m : map)
            result = max(result, m.second);
        return result;
    }
};