class Solution {
public:
    string minWindow(string s, string t) {
         if (s.length() < t.length())
            return "";
        map<char, int> mapT;
        for (int i = 0; i < t.length(); i++)
        {
            mapT[t[i]]++;
        }
        int required = mapT.size();
        map<char, int> mapS;
        int l = 0;
        int r = 0;
        int formed = 0;
        int ans[] = {-1, 0, 0};
        while (r < s.length())
        {
            mapS[s[r]]++;
            if (mapS[s[r]] == mapT[s[r]])
            {
                formed++;
            }
            while (l <= r && formed == required)
            {
                if (ans[0] == -1 || r - l + 1 < ans[0])
                {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }
                mapS[s[l]]--;
                if (mapS[s[l]] < mapT[s[l]])
                    formed--;
                l++;
            }
            r++;
        }
        return ans[0] == -1 ? "" : s.substr(ans[1], ans[0]);
    }
};