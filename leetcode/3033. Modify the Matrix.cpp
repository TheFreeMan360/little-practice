class Solution {
public:
    vector<vector<int>> modifiedMatrix(vector<vector<int>>& matrix) {
        for (int c = 0; c < matrix[0].size(); ++c) {
            int colMax = -1;
            for (int r = 0; r < matrix.size(); ++r) {
                colMax = max(colMax, matrix[r][c]);
            }

            for (int r = 0; r < matrix.size(); ++r) {
                if (matrix[r][c] == -1)
                    matrix[r][c] = colMax;
            }
        }
        return matrix;
    }
};