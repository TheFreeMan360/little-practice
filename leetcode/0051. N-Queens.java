class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList();
        int[] qp = new int[n]; // queen position
        Arrays.fill(qp, -1);
        backtracking(ans, qp, 0);
        return ans;
    }

    private List<String> bulidBoard(int[] qp){
        List<String> board = new ArrayList();
        char[] tmp = new char[qp.length];
        Arrays.fill(tmp, '.');
        for(int inx : qp){
            tmp[inx] = 'Q';
            board.add(new String(tmp));
            tmp[inx] = '.';
        }
        return board;
    }

    private boolean isSafe(int[] qp, int row, int col){
        for(int i = 0 ; i < row ; i++)
            if(qp[i] == col || Math.abs(qp[i] - col) == Math.abs(i - row))
                return false;
        return true;
    }

    private void backtracking(List<List<String>> ans, int[] qp, int row){
        int n = qp.length;
        if(row == n){
            ans.add(bulidBoard(qp));
            return;
        }

        for(int col = 0 ; col < n ; col++){
            if(!isSafe(qp, row, col))continue;
            qp[row] = col;
            backtracking(ans, qp, row + 1);
            qp[row] = -1;
        }
    }
}