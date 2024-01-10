class Solution {
public:
    string maximumOddBinaryNumber(string s) {
        int n = s.size(), countOnes = 0;
        for(int i = 0; i < n; ++i){
            countOnes += s[i] - 48;
        }
        for(int i = 0; i < n - 1; ++i){
            if(countOnes > 1){
                --countOnes;
                s[i] = '1';
            }else{
                s[i] = '0';
            }
        }
        s[n - 1] = '1';
        return s;
    }
};