class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        char[] ca = word.toCharArray();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, ca, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] word, int i, int j, int wI) {
        int m = board.length, n = board[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] == '#')
            return false;
        if (wI == word.length - 1 && board[i][j] == word[wI])
            return true;
        if (board[i][j] != word[wI])
            return false;

        char tmp = board[i][j];
        board[i][j] = '#';

        boolean rlst = dfs(board, word, i + 1, j, wI + 1)
                || dfs(board, word, i - 1, j, wI + 1)
                || dfs(board, word, i, j + 1, wI + 1)
                || dfs(board, word, i, j - 1, wI + 1);

        board[i][j] = tmp;
        return rlst;
    }

}