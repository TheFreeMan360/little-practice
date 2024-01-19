class Solution {
public:
    int minFallingPathSum(vector<vector<int>>& matrix) {
        int m = matrix.size(), n = matrix[0].size();

        for(int r = 1; r < m; ++r){
            for(int c = 0; c < n; ++c){
                int minNum = matrix[r - 1][c];
                if(c - 1 >= 0)
                    minNum = min(minNum, matrix[r - 1][c - 1]);
                if(c + 1 < n)
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
};