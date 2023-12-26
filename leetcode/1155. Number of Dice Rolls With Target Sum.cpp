class Solution {
public:
    int mod = (int)1e9 + 7;
    int dp[32][1002];

    Solution() { memset(dp, -1, sizeof(dp)); }

    int numRollsToTarget(int n, int k, int target) {
        if (target == 0 && n == 0) {
            return 1;
        }

        if (n > target || n * k < target) {
            return 0;
        }

        if (dp[n][target] != -1) {
            return dp[n][target] % mod;
        }

        int ways = 0;
        for (int f = 1; f <= k; ++f) {
            ways = (ways + numRollsToTarget(n - 1, k, target - f)) % mod;
        }
        dp[n][target] = ways % mod;
        return ways;
    }
};