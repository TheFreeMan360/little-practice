class Solution {
public:
    string maximumOddBinaryNumber(string s) {
        int ones = 0, zeros = 0;
        for(const char& ch : s){
            if(ch == '1') ones += 1;
            if(ch == '0') zeros += 1;
        }

        string ans = string(ones - 1, '1') + string(zeros, '0') + "1";
        return ans;
    }
};