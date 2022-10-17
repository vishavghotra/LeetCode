class Solution {
public:
     bool checkIfPangram(string sentence)
    {
       int seen  = 0;
        for(int i = 0; i < sentence.length(); i++) {
            seen = seen | (1 << (sentence[i] - 'a'));
        }
        return seen == (1 << 26) - 1;
    }
};