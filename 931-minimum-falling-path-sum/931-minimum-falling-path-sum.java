class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        dp[matrix.length-1] = matrix[matrix.length -1];
       /* for(int i = 0; i < matrix.length; i++) {
            dp[matrix.length -1 ][i] = matrix[matrix.length - 1][i];
        } */
        for(int i = matrix.length -2; i >=0 ; i-- ) {
for(int j = 0; j< matrix[0].length; j++) {
    if(j == 0) {
        dp[i][j] = Math.min(matrix[i][j] + dp[i+1][j], matrix[i][j] + dp[i+1][j+1]);
        
    }
    else if (j == matrix[0].length -1) {
        dp[i][j] = Math.min(matrix[i][j] + dp[i+1][j], matrix[i][j] + dp[i+1][j-1]);
        
    }
    else {
        dp[i][j] = matrix[i][j] + Math.min(dp[i+1][j],Math.min(dp[i+1][j-1], dp[i+1][j+1]));
    }
  
    
}
        
        
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< matrix.length; i++) {
            if(min > dp[0][i]) min = dp[0][i];
            
        }
        return min;
    }
}