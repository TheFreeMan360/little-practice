class Solution {
public:
    int longestCommonSubsequence(string text1, string text2) {
        int m = text1.length(), n = text2.length();
        int dp[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (text1[i] == text2[j])
                    dp[i][j] =
                        1 + (i - 1 >= 0 && j - 1 >= 0 ? dp[i - 1][j - 1] : 0);
                else
                    dp[i][j] = max(i - 1 >= 0 ? dp[i - 1][j] : 0,
                                   j - 1 >= 0 ? dp[i][j - 1] : 0);
            }
        }
        return dp[m - 1][n - 1];
    }
};