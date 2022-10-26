class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& word1, vector<string>& word2) {
        int n = 0, m = 0;
        int i = 0, j = 0;
        while (n < word1.size() && m < word2.size())
        {
            if (word1[n][i++] != word2[m][j++])
            {
                return false;
            }
            if (i >= word1[n].size())
            {

                n++;
                i = 0;
            }
            if (j >= word2[m].size())
            {
                m++;
                j = 0;
            }
            
        }
        return n == word1.size() && m == word2.size();
    }
};