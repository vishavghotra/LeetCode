class Solution {
     public int minMoves(int target, int k) {
        int res = 0;
        while (target > 1 && k > 0) {  
            if(target % 2 == 0) {
                target /= 2;
                 k--;
            }
            else target--;
           
           
            res++;
        }
        return target - 1 + res;
    }
}