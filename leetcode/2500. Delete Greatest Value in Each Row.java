class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int r = 0; r < grid.length; ++r) 
            Arrays.sort(grid[r]);

        int sum = 0;
        for(int c = grid[0].length - 1; c >= 0; --c){
            int colMax = grid[0][c];
            for(int r = 1; r < grid.length; ++r)
                colMax = Math.max(colMax, grid[r][c]);
            sum += colMax;
        }
        return sum;
    }
}