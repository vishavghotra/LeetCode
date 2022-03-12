class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r*c)
            return mat;
        else {
            int[][] replace = new int[r][c];
            for(int i = 0; i < mat[0].length*mat.length; i++) {
                int number = mat[i/mat[0].length][i % mat[0].length];
                replace[i/c][i%c]  = number;
                
                
            }
            return replace;
            
            
        }
    }
}