class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] ans = new int[n][m];
        
        for(int row = 0 ; row < n ; row++)
            for(int col = 0 ; col < m ; col++)
                ans[row][col] = matrix[col][row];
        
        return ans;
    }
}