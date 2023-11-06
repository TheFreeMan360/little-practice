class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length; 
        int[][] grid = new int[m][n];

        int noOb = 1;
        for(int i = n - 1 ; i >= 0 ; i--){
            if(obstacleGrid[m - 1][i] == 1)noOb = 0;
            grid[m - 1][i] = noOb;
        }
        
        noOb = 1;
        for(int i = m -1 ; i >= 0 ; i--){
            if(obstacleGrid[i][n - 1] == 1)noOb = 0;
            grid[i][n - 1] = noOb;
        }

        for(int row = m - 2 ; row >= 0; row--){
            for(int col = n - 2 ; col >= 0; col--){
                if(obstacleGrid[row][col] == 1)continue;
                grid[row][col] += (grid[row + 1][col] + grid[row][col + 1]);
            }
        }
        return grid[0][0];
    }
}