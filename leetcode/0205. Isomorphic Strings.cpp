class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int sCount[128] = {0};
        int tCount[128] = {0};
        for(int i = 0; i < s.length(); ++i){
            if(sCount[s[i]] != tCount[t[i]]){
                return false;
            }
            sCount[s[i]] = i + 1;
            tCount[t[i]] = i + 1;
        }

        return true;
    }
};