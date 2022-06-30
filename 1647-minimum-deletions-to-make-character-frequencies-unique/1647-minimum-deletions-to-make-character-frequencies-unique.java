class Solution {
    public int minDeletions(String s) {
        int[] cnt = new int[26];
    int[] fr = new int[100001];  // use hashset instead!
    int result = 0;
    for (char c : s.toCharArray())
      cnt[c - 'a']++;
    for (int i = 0; i < 26; i++) {
      while (cnt[i] > 0 && fr[cnt[i]] > 0) {
        --cnt[i];
        ++result;
      }
      fr[cnt[i]]++;
    }
    return result;
    }
}