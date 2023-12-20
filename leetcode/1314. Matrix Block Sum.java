class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        
        for(int c = 1; c < n; ++c) 
            mat[0][c] += mat[0][c - 1]; 
        
        for(int r = 1; r < m; ++r) 
            mat[r][0] += mat[r - 1][0];
        
        for(int r = 1; r < m; ++r)
            for(int c = 1; c < n; ++c)
                mat[r][c] += (mat[r - 1][c] + mat[r][c - 1] - mat[r - 1][c - 1]);
        
        int[][] ans = new int[m][n];

        for(int r = 0; r < m; ++r){
            int up = r - k - 1, down = Math.min(m - 1, r + k);
            for(int c = 0; c < n; ++c){
                int left = c - k - 1, right = Math.min(n - 1, c + k);
                ans[r][c] = mat[down][right]
                          - (up >= 0? mat[up][right]: 0)    
                          - (left >= 0? mat[down][left]: 0)
                          + (up >= 0 && left >= 0? mat[up][left]: 0);
            }
        }
        return ans;
    }
}