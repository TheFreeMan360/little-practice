class Solution {
public:
    long long flowerGame(int n, int m) {
        long long xe = get(n), xo = n - xe;
        long long ye = get(m), yo = m - ye;
        return xe * yo + ye * xo;
    }
    
    long long get(int num){
        return (num - num % 2) / 2;
    }
};