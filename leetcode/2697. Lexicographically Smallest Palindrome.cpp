class Solution {
public:
    string makeSmallestPalindrome(string s) {
        int n = s.length();
        for(int i = 0; i < n / 2; ++i){
            if(s[i] != s[n - 1 - i]){
                char tmp = min(s[i], s[n - 1 - i]);
                s[i] = tmp;
                s[n - 1 - i] = tmp;
            }
        }
        return s;
    }
};