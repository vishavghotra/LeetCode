class Solution {
    public boolean isPossible(int[] target) {
        if (target.length == 1) return target[0] == 1;
         int sum = 0;
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    for (int num : target) {
      queue.add(num);
        sum += num;
    }
    while (queue.peek() != 1) {
      int curr = queue.poll();
      if (sum - curr == 1)  // array size: 2
        return true;
      int x = curr % (sum - curr);   // x could be also another than 1 for example 3 which can be again achieved in other iteration like  example when all other are 1  
      sum = sum - curr + x;  
      if (x == 0 || x == curr)
        return false;
      queue.add(x);     // x != 1 also added which can be achieved later backtracking

    }
    return true;
    }
}