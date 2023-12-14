class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        /*
            zero = len - one
            diff = one - zero = one - (len - one) = one * 2 - len  
        */
        int m = grid.length, n = grid[0].length;
        int[] diffRow = new int[m], diffCol = new int[n];

        //caculate row diff
        for(int row = 0; row < m; ++row){
            int ones = 0;
            for(int col = 0; col < n; ++col) ones += grid[row][col];
            diffRow[row] = ones * 2 - m;
        }

        //caculate col diff
        for(int col = 0; col < n; ++col){
            int ones = 0;
            for(int row = 0; row < m; ++row) ones += grid[row][col];
            diffCol[col] = ones * 2 - n;
        }

        for(int row = 0; row < m; ++row)
            for(int col = 0; col < n; ++col)
                grid[row][col] = diffRow[row] + diffCol[col]; 
             
        return grid; 
    }
}