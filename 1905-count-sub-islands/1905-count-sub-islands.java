class Solution {
    int[][] directions = {{1,0},{0,1},{0,-1},{-1,0}};
   public int countSubIslands(int[][] grid1, int[][] grid2) {
    int result = 0;
for(int i = 0; i< grid1.length; i++) {
for(int j  =0; j<grid1[0].length; j++) {
  if(grid2[i][j] == 1){
    if(isSubIsland(grid1, grid2, i, j))
    result++;
  }
}

}
return result;


  }
  public boolean isSubIsland(int[][] grid1, int[][] grid2, int i, int j) {
if(i < 0 || i >= grid2.length || j < 0 || j >= grid2[0].length || grid2[i][j] == 0) 
return true;
      
if(grid1[i][j] == 0)
return false;
grid2[i][j] = 0;
 boolean res = true;
      for(int[] dir : directions)
          res = res & isSubIsland(grid1, grid2, i+dir[0], j+dir[1]);
      return res;
  }
}