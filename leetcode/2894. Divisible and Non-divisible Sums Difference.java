class Solution {
    public int differenceOfSums(int n, int m) {
        int ans = 0;
        for (int num = 1; num <= n; ++num)
            ans += (num % m == 0)? -num : num;
        return ans;
    }
}