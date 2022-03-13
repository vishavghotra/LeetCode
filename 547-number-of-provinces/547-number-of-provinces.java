class Solution {
   public int findCircleNum(int[][] isConnected) {
		 int result=0;
		 boolean[] visited=new boolean[isConnected.length];
		 for(int i=0;i<isConnected.length;i++) {
			 for(int j=0;j<isConnected.length;j++) {
				
				 if(isConnected[i][j]==1 && visited[j]==false) {
				 dfs(isConnected,visited,i,j);
					result++;
				 }
			 }
		
			 
			 
		 }
		 return result;
		 
		 
		 
	 }
	 public void dfs(int[][] isConnected,boolean[] visited,int x,int y) {
			visited[y]=true;
		
		  {
			 for(int i=0;i<visited.length;i++) {
				 if(isConnected[y][i]==1 && visited[i]==false && y!=i)
					 dfs(isConnected,visited,y,i);
				 
			 }
			 
		 }
		 
		 
	 }
}
