class Solution {
public:
    int minFallingPathSum(vector<vector<int>>& matrix) {
        int m = matrix.size(), n = matrix[0].size();

        for(int r = 1; r < m; ++r){
            for(int c = 0; c < n; ++c){
                int minNum = INT_MAX;
                if(isValidInx(r - 1, c - 1, m, n))
                    minNum = min(minNum, matrix[r - 1][c - 1]);
                if(isValidInx(r - 1, c, m, n))
                    minNum = min(minNum, matrix[r - 1][c]);
                if(isValidInx(r - 1, c + 1, m, n))
                    minNum = min(minNum, matrix[r - 1][c + 1]);

                matrix[r][c] += minNum;
            }
        }

        int ans = matrix[m - 1][0];
        for(int c = 1; c < n; ++c){
            ans = min(ans, matrix[m - 1][c]);
        }
        return ans;
    }

    inline bool isValidInx(int r, int c, int m, int n){
        return r >= 0 && r < m && c >= 0 && c < n;
    }
};