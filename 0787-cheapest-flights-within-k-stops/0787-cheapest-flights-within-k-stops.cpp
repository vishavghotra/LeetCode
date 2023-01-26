class Solution {
public:
int findCheapestPrice(int n, vector<vector<int>> &flights, int src, int dst, int k)
  {
    vector<vector<pair<int, int>>> tree(n);
    for (int i = 0; i < flights.size(); i++)
    {
      tree[flights[i][0]].push_back({flights[i][1], flights[i][2]});
    }
    queue<pair<int, int>> queue;
    vector<int> dist(n, INT_MAX);
    queue.push({src, 0});
    dist[src] = 0;
    while (!queue.empty() && k >= 0)
    {
      int size = queue.size();
      for (int i = 0; i < size; i++)
      {
        auto p = queue.front();
        queue.pop();
        for (auto [neighbour, price] : tree[p.first])
        {
          if (dist[neighbour] > price + p.second)
          {
            dist[neighbour] = price + p.second;
            queue.push({neighbour, dist[neighbour]});
          }
        }
      }
      k--;
    }
    return dist[dst] == INT_MAX ? -1 : dist[dst];
}
};