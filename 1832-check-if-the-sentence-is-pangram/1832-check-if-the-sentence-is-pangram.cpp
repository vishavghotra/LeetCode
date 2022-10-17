class Solution {
public:
     bool checkIfPangram(string sentence)
    {
        bool check[26];
         for(int i = 0; i < 26; i++) check[i] = false;
        for (int i = 0; i < sentence.length(); i++)
        {
            check[sentence[i] - 'a'] = true;
        }
        for (int i = 0; i < 26; i++)
        {
            if (check[i] == false)
                return false;
        }
        return true;
    }
};