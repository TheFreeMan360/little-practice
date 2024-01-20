class Solution {
public:
    int numRookCaptures(vector<vector<char>>& board) {
        int x = 0, y = 0;
        for (int r = 0; r < 8; ++r) {
            for (int c = 0; c < 8; ++c) {
                if (board[r][c] == 'R') {
                    x = r;
                    y = c;
                    break;
                }
            }
        }

        int ans = 0;
        for (int c = y + 1; c < 8; ++c) { // right
            if (board[x][c] == 'B') {
                break;
            }
            if (board[x][c] == 'p') {
                ans += 1;
                break;
            }
        }

        for (int c = y - 1; c >= 0; --c) { // left
            if (board[x][c] == 'B') {
                break;
            }
            if (board[x][c] == 'p') {
                ans += 1;
                break;
            }
        }

        for (int r = x + 1; r < 8; ++r) { // down
            if (board[r][y] == 'B') {
                break;
            }
            if (board[r][y] == 'p') {
                ans += 1;
                break;
            }
        }

        for (int r = x - 1; r >= 0; --r) { // up
            if (board[r][y] == 'B') {
                break;
            }
            if (board[r][y] == 'p') {
                ans += 1;
                break;
            }
        }
        return ans;
    }
};