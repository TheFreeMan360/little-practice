class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] rowFlag = new boolean[m], colFlag = new boolean[n];

        for (int row = 0; row < m; ++row){
            for (int col = 0; col < n; ++col){
                if (matrix[row][col] == 0){
                    rowFlag[row] = true;
                    colFlag[col] = true;
                }
            }    
        }

        for (int row = 0; row < m; ++row){
            for (int col = 0; col < n; ++col){
                if (rowFlag[row] || colFlag[col]){
                    matrix[row][col] = 0;
                }
            }    
        }
    }
}