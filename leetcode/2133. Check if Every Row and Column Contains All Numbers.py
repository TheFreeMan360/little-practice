class Solution:
    def checkValid(self, matrix: List[List[int]]) -> bool:
        n = len(matrix)
        for row in matrix:
            s = set(row)
            if len(s) != n:
                return False
        
        for c in range(n):
            s = set([matrix[r][c] for r in range(n)])
            if len(s) != n:
                return False

        return True