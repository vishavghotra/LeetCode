class Solution {
public:
    int closestMeetingNode(vector<int>& edges, int node1, int node2) {
   queue<int> stack1;
    queue<int> stack2;
    stack1.push(node1);
    stack2.push(node2);
    vector<int> dis1(edges.size(), -1);
    vector<int> dis2(edges.size(), -1);
    int dis = 0;

    while (!stack2.empty() || !stack1.empty())
    {
      if (!stack1.empty())
      {
        int size = stack1.size();
        for (int i = 0; i < size; i++)
        {
          int top = stack1.front();

          if (  dis1[top] == -1)
          {
            dis1[top] = dis;
              if(edges[top] != -1)
            stack1.push(edges[top]);
          }
          stack1.pop();
        }
      }
      if (!stack2.empty())
      {
        int size = stack2.size();
        while (size--)
        {
          int elem = stack2.front();
          
          if ( dis2[elem] == -1)
          {
            dis2[elem] = dis;
              if(edges[elem] != -1)
            stack2.push(edges[elem]);
          }
          stack2.pop();
        }
      }
      dis++;
    }
    int result = 0;
    int max_ = edges.size();
   
    for (int i = 0; i < dis1.size(); i++)
    {
        cout << dis1[i] << dis2[i] << endl;
      if (dis1[i] == -1 || dis2[i] == -1)
        continue;
      else if (max_ > max(dis1[i], dis2[i])) {
        result = i;
          max_ = max(dis1[i], dis2[i]);
      }
    }
    return max_ == edges.size() ? -1 : result;
    }
};