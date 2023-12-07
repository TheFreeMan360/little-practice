class Solution {
    public void rotate(int[][] matrix) {
        int matLen = matrix.length;

        for (int i = 0; i < matLen; i++) {
            for (int j = i; j < matLen; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matLen; i++) {
            for (int j = 0; j < matLen / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][matLen - j - 1];
                matrix[i][matLen - j - 1] = tmp;
            }
        }
    }
}