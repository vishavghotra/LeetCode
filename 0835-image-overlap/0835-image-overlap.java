class Solution {
    
    /*
       int ret = 0;
    vector<vector<int>> walked;
    int s;
    void func(vector<vector<int>>& A, vector<vector<int>>& B, int x, int y){
        if(abs(x) >= s || abs(y) >= s)return;
        if(walked[s+x][s+y])return;
        walked[s+x][s+y] = 1;
        int cnt = 0;
        for(int i=0; i<s; i++){
            for(int j=0; j<s; j++){
                if(i+x >= s || i+x < 0 || j+y >= s || j+y < 0)continue;
                if(A[i][j] && B[i+x][j+y])cnt++;
            }
        }
        ret = max(ret, cnt);
        func(A,B,x+1,y);
        func(A,B,x,y+1);
        func(A,B,x-1,y);
        func(A,B,x,y-1);
    }
    int largestOverlap(vector<vector<int>>& A, vector<vector<int>>& B) {
        walked.resize(A.size()*2,vector<int>(A.size()*2,0));
        s = A.size();
        func(A,B,0,0);
        return ret;
    }  */
   public int largestOverlap(int[][] A, int[][] B) {
        int ans = 0;
        for (int row = -A.length + 1; row < A.length; row++) {
            for (int col = -A[0].length + 1; col < A[0].length; col++) {
                ans = Math.max(ans, overlap(A, B, row, col));
            }
        }
        return ans;
    }
    public int overlap(int[][] A, int[][] B, int rowOffset, int colOffset) {
        int ans = 0;
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[0].length; col++) {
                if ((row+rowOffset < 0 || row+rowOffset >= A.length) || (col + colOffset < 0 || col + colOffset >= A.length)) {
                    continue;
                }
                if(A[row][col] == 1 && B[row + rowOffset][col+colOffset] == 1) {
                    ans++;
                }
            }
        }
        return ans;
    }
}