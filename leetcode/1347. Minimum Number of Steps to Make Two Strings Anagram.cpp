class Solution {
public:
    int minSteps(string s, string t) {
        int countS[26] = {0}; 
        int countT[26] = {0};

        for(int i = 0; i < s.length(); ++i){
            ++countS[s[i] - 97];
            ++countT[t[i] - 97];
        }

        int ans = 0;
        for(int i = 0; i < 26; ++i){
            int diff = countT[i] - countS[i];
            ans += (diff > 0)? diff : 0;  
        }
        return ans;
    }
};