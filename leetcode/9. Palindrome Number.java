class Solution {
    public boolean isPalindrome(int x) {
        if (x >= 0 && x <= 9) return true;
        if (x < 0 || x % 10 == 0) return false;
        int a = 0;
        for(int n = x; n != 0; n /= 10){
            a *= 10;
            a += n % 10;
        }

        return a == x;
    }
}