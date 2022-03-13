class Solution {
    public int makeConnected(int n, int[][] connections) {
       if(connections.length  < n -1) return -1;
    List<List<Integer>> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(new ArrayList<>());
    }
    for (int[] conn : connections) {
      list.get(conn[0]).add(conn[1]);
      list.get(conn[1]).add(conn[0]);
    }

    boolean[] visited = new boolean[n];
    int components = 0;
    for (int i = 0; i < n; i++)
      components += bfs(list, visited, i);
    return (components == 0)?-1: components - 1;

  }

  public int bfs(List<List<Integer>> list, boolean[] visited, int i) {
    if (visited[i])
      return 0;

    Queue<Integer> queue = new LinkedList<>();
    queue.offer(i);
   visited[i] = true;
    while (!queue.isEmpty()) {
      int number = queue.poll();
     
      for (int u : list.get(number)) {
        if (visited[u])
          continue;
        else {
          queue.offer(u);
          visited[u] = true;
        }
      }
    }
    return 1;

  }
}