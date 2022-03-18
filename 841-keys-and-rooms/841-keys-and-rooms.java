class Solution {
   public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    boolean[] visited = new boolean[rooms.size()];
     
    unlock(rooms, 0, visited);
    for (int i = 0; i < visited.length; i++) {
      if (visited[i] == false)
        return false;
    }
    return true;

  }

  public void unlock(List<List<Integer>> rooms, int index, boolean[] visited) {
    if (visited[index])
      return;
      visited[index] = true;
    for (int i = 0; i < rooms.get(index).size(); i++) {

      unlock(rooms, rooms.get(index).get(i), visited);
    }

  }

}