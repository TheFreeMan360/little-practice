class Solution:
    def maxWidthOfVerticalArea(self, points: List[List[int]]) -> int:
        arr = sorted([p[0] for p in points])
        return max(list(map(lambda x, y: x - y, arr[1:], arr[:-1])))