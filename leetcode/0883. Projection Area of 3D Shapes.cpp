class Solution {
public:
    int projectionArea(vector<vector<int>>& grid) {
        int n = grid.size(), ans = 0;
        for(int r = 0; r < n; ++r){
            int rowMax = INT_MIN, colMax = INT_MIN;
            for(int c = 0; c < n; ++c){
                if(grid[r][c] > 0) ans += 1;
                rowMax = max(rowMax, grid[r][c]);
                colMax = max(colMax, grid[c][r]);
            }
            ans += rowMax + colMax;
        }
        return ans;
    }
};