class Solution {
public:
    int minFlips(int a, int b, int c) {
        int ans = 0;
        while(a > 0 || b > 0 || c > 0){
            int bitA = a % 2;
            int bitB = b % 2;
            int bitC = c % 2;

            if(bitC){
                ans += (!bitA & !bitB);
            }else{
                ans += (bitA + bitB);
            }

            a /= 2;
            b /= 2;
            c /= 2;
        }
        return ans;
    }
};