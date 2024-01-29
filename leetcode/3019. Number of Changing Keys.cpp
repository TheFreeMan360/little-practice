class Solution {
public:
    int countKeyChanges(string s) {
        int ans = 0;
        for(int i = 1; i < s.length(); ++i){
            if((s[i - 1]  | ' ') != (s[i]  | ' ')){
                ans += 1;
            }
        }
        return ans;
    }
};