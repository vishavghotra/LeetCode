class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] countT = new int[7];
        int[] countB = new int[7];
        int[] same = new int[7];
        for(int i = 0; i< tops.length; i++) {
            countT[tops[i]]++;
            countB[bottoms[i]]++;
            if(tops[i] == bottoms[i])
                same[tops[i]]++;
        }
        for(int i = 1; i< 7; i++) {
            if(countT[i] + countB[i] - same[i] == tops.length)
                return Math.min(countT[i], countB[i]) - same[i];
        }
        return -1;
        
    }
}