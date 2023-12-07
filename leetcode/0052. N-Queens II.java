class Solution {
    public int totalNQueens(int n) {
        int[] ans = new int[1];
        int[] qp = new int[n]; // queen position
        Arrays.fill(qp, -1);
        backtracking(ans, qp, 0);
        return ans[0];
    }

    private boolean valid(int[] qp, int row, int col) {
        for (int i = 0; i < row; i++)
            if (qp[i] == col || Math.abs(qp[i] - col) == Math.abs(i - row))
                return false;
        return true;
    }

    private void backtracking(int[] ans, int[] qp, int row) {
        int n = qp.length;
        if (row == n) {
            ans[0]++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (!valid(qp, row, col))
                continue;
            qp[row] = col;
            backtracking(ans, qp, row + 1);
            qp[row] = -1;
        }
    }
}