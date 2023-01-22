class Solution {
public:
    int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0;
    int n = 0;
    while (numBottles)
    {
      ans += numBottles;
      int ne = (numBottles + n) % numExchange;
      numBottles = (numBottles + n) / numExchange;
      n = ne;
    }
    return ans;
    }
};