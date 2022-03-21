class Solution {
    public List<Integer> partitionLabels(String S) {
       List<Integer> res = new ArrayList<>();
        int[] index = new int[26];
        for (int i = 0; i < S.length(); i++) {
            index[S.charAt(i) - 'a'] = i;
        }
        int start = 0;
        int end = -1;
        for (int i = 0; i < S.length(); i++) {
            int c = S.charAt(i) - 'a';
          
                if (index[c] > end) {
                    end = index[c];
                
            } if(i == end) {
                res.add(i - start + 1);
                start = i + 1;
            
            }
        }
        return res;
    }
}