class Solution:
    def modifiedMatrix(self, matrix: List[List[int]]) -> List[List[int]]:
        for c in range(len(matrix[0])):
            col_max = -1
            for r in range(len(matrix)):
                col_max = max(col_max, matrix[r][c])

            for r in range(len(matrix)):
                if matrix[r][c] == -1:
                    matrix[r][c] = col_max

        return matrix