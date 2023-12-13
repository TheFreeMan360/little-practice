class Solution {
    public int numSpecial(int[][] mat) {
        int ans = 0;

        for (int row = 0; row < mat.length; ++row){
            for (int col = 0; col < mat[0].length; ++col){
                if(mat[row][col] == 1
                    && checkRow(mat, row, col) 
                    && checkCol(mat, row, col)){
                    ++ans;
                }
            }
        }

        return ans; 
    }

    private boolean checkRow(int[][] mat, int row, int col){
        for (int c = col - 1; c >= 0; --c)
            if (mat[row][c] == 1) return false;
        
        for (int c = col + 1; c < mat[0].length; ++c)
            if (mat[row][c] == 1) return false;

        return true;
    }

    private boolean checkCol(int[][] mat, int row, int col){
        for (int r = row - 1; r >= 0; --r)
            if (mat[r][col] == 1) return false;
        
        for (int r = row + 1; r < mat.length; ++r)
            if (mat[r][col] == 1) return false;

        return true;
    }

}