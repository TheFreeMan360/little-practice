class Solution {
public:
    int minOperations(string s) {
        /*
            index i :  [0,1,2,3..]
            index i%2 :[0,1,0,1..]

            0,1,0,1...0 + 1,0,1,0...1 all 1 bit = len
            01 can do bit inversion to 10
            so when s change to 01  need n bit
            than s change to 10 need len - n bit
        */
        if (s.size() == 1)
            return 0;

        int startOneNeedOperation = 0, n = s.length();

        for (int i = 0; i < n; ++i) {
            if (s[i] - '0' == i % 2) {
                ++startOneNeedOperation;
            }
        }

        return min(startOneNeedOperation, n - startOneNeedOperation);
    }
};