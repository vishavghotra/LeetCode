class Solution {
    public int diagonalSum(int[][] mat) {
        int primaryDiagonal = 0;
        int secondaryDiagonal  =0;
        for(int i = 0; i < mat.length; i++) {
            if(mat.length-1 - i == i)
                primaryDiagonal += mat[i][i];
            else {primaryDiagonal += mat[i][i];
                  secondaryDiagonal += mat[i][mat.length-1-i];
        }
        }
        return primaryDiagonal + secondaryDiagonal;
    }
}