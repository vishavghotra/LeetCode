class Solution {
public:
    vector<string> topKFrequent(vector<string>& words, int k) {
   map<string, int> map;
        for (int i = 0; i < words.size(); i++)
        {
            map[words[i]]++;
        }
        priority_queue<pair<string, int>, vector<pair<string, int>>, Comp> pq;
        for (auto a : map)
        {
            pq.push(a);
        }
        vector<string> result;
        while (pq.size() && k--)
        {
            result.push_back(pq.top().first);
            pq.pop();
        }
        return result;
    }
    struct Comp
    {
        Comp() {}
        bool operator()(const pair<string, int> &a, const pair<string, int> &b)
        {
            return a.second < b.second || (a.second == b.second && a.first > b.first);
        }
    };
};