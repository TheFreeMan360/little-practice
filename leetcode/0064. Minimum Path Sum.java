class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        for(int i = 1 ; i < n ; i++) grid[0][i] += grid[0][i - 1];
        for(int i = 1 ; i < m ; i++) grid[i][0] += grid[i - 1][0];

        for(int row = 1 ; row < m; row++){
            for(int col = 1 ; col < n; col++){
                grid[row][col] += (int)Math.min(grid[row-1][col], grid[row][col-1]);
            }
        }

        return grid[m - 1][n - 1];
    }
}