class Solution:
    def onesMinusZeros(self, grid: List[List[int]]) -> List[List[int]]:
        row_diff = [sum(row) * 2 - len(grid) for row in grid]
        col_diff = [sum(col) * 2 - len(grid[0]) for col in zip(*grid)]
        return [[row_diff[i] + col_diff[j] for j in range(len(grid[0]))] for i in range(len(grid))]