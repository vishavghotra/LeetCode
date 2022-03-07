class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j<grid[0].length ; j++){
               result = Math.max(result, setMatrix(grid, i, j));
                
            }
            
        }
        return result;
    }
    
    public int setMatrix(int[][] grid, int i, int j) {
        if( i < 0 || i>= grid.length || j<0 || j >= grid[0].length || grid[i][j] == 0)
            return 0;
        grid[i][j] = 0;
        return 1 + setMatrix(grid, i+1, j) + setMatrix(grid, i, j+1) + setMatrix(grid, i-1, j) + setMatrix(grid ,i, j-1);
        
        
    }
}