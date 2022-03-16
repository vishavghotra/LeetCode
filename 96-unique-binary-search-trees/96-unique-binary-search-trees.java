class Solution {
    public int numTrees(int n) {
        int[] order = new int[n+1];
        order[0] = 1;
        order[1] = 1;
        for(int i = 2; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                order[i] += order[j] * order[i-1-j];
            }
            
        }
        return order[n];
    }
}