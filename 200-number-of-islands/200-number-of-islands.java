class Solution {
     public int numIslands(char[][] grid) {
		 int count=0;
		 LinkedList<Integer> list=new LinkedList<Integer>();
		 for(int i=0;i<grid.length;i++) {
			 for(int j=0;j<grid[0].length;j++) {
				 if(grid[i][j]=='1') {
					 bfs(list,i,j,grid);
					 count++;
					 
				 }
				 
				 
			 }
			 
			 
			 
		 }
		 return count;
	        
	    }
	 
	 public void bfs(LinkedList<Integer> list,int x,int y,char[][] grid) {
		 grid[x][y]='0';
		 int m=grid[0].length;
		 int code=x*grid[0].length+y;
		 list.offer(code);
		 while(!list.isEmpty()) {
		code=list.poll();
		int i=code/grid[0].length;
		int j=code%grid[0].length;
			 if(i>0 && grid[i-1][j]=='1' ) {
				 list.offer((i-1)*m+j);
				 grid[i-1][j]='0';
				 
			 }
			 
			 if(i<grid.length-1 && grid[i+1][j]=='1') {
				 list.offer((i+1)*m+j);
				 grid[i+1][j]='0';
			 }
			 
			 if(j>0 && grid[i][j-1]=='1') {
				 list.offer(i*m+(j-1));
				 grid[i][j-1]='0';
						 
			 }
			 
			 if(j<m-1 && grid[i][j+1]=='1') {
				 list.offer(i*m+(j+1));
				 grid[i][j+1]='0';
			 }
			 
			 
			 
		 }
		 
		 
		 
		 
	 }
		
}