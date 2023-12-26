class Solution {
public:
    int coinChange(vector<int>& coins, int amount) {
        sort(coins.begin(), coins.end());
        vector<int> dp(amount + 1, amount + 1);
        dp[0] = 0;

        for (int coin : coins) {
            for (int am = coin; am <= amount; ++am) {
                dp[am] = min(dp[am - coin] + 1, dp[am]);
            }
        }
        return dp[amount] > amount? -1: dp[amount];
    }
};