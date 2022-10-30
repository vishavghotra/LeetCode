class Solution {
public:
    
    int earliestFullBloom(vector<int> &plantTime, vector<int> &growTime)
    {
        vector<pair<int, int>> mapped;
        for (int i = 0; i < plantTime.size(); i++)
        {
            mapped.push_back({ growTime[i], plantTime[i],});
        }
        sort(mapped.rbegin(), mapped.rend());
        int time = 0;
        int end = 0;
        for (int i = 0; i < plantTime.size(); i++)
        {
            time = max(time, end + mapped[i].first + mapped[i].second);
            end += mapped[i].second;
        }
        return time;
    }
};