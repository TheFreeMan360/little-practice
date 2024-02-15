class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        for (int c = 0; c < matrix[0].length; ++c) {
            int colMax = -1;
            for (int r = 0; r < matrix.length; ++r) {
                colMax = Math.max(colMax, matrix[r][c]);
            }

            for (int r = 0; r < matrix.length; ++r) {
                if (matrix[r][c] == -1)
                    matrix[r][c] = colMax;
            }
        }
        return matrix;
    }
}