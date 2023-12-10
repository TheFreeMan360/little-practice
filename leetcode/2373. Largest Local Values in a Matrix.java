class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n - 2][n - 2];
        
        for (int row = 1; row < n - 1; ++row){
            for (int col = 1; col < n - 1; ++col){
                ans[row - 1][col - 1] = getLocalLagest(grid, row, col);
            }
        }

        return ans;
    }

    private int getLocalLagest(int[][] grid, int row, int col){
        int max = grid[row][col];
        max = Math.max(max, grid[row - 1][col - 1]);
        max = Math.max(max, grid[row - 1][col]);
        max = Math.max(max, grid[row - 1][col + 1]);
        
        max = Math.max(max, grid[row][col - 1]);
        max = Math.max(max, grid[row][col + 1]);

        max = Math.max(max, grid[row + 1][col - 1]);
        max = Math.max(max, grid[row + 1][col]);
        max = Math.max(max, grid[row + 1][col + 1]);

        return max;
    }
}