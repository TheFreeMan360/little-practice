class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];

        for (int i = 0; i < n; i++)
            grid[m - 1][i] = 1;
        for (int i = 0; i < m; i++)
            grid[i][n - 1] = 1;

        for (int row = m - 2; row >= 0; row--) {
            for (int col = n - 2; col >= 0; col--) {
                grid[row][col] += (grid[row + 1][col] + grid[row][col + 1]);
            }
        }
        return grid[0][0];
    }
}