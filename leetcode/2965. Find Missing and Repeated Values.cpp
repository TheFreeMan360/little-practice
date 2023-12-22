class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        int n = grid.size();
        vector<int> ans(2);
        vector<bool> hasNum(n * n + 1);

        for (int r = 0; r < n; ++r) {
            for (int c = 0; c < n; ++c) {
                int num = grid[r][c];
                if (hasNum[num])
                    ans[0] = num;
                else
                    hasNum[num] = true;
            }
        }

        for (int num = 1; num < n * n + 1; ++num) {
            if (!hasNum[num]) {
                ans[1] = num;
                break;
            }
        }

        return ans;
    }
};