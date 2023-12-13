class Solution:
    def maxWidthOfVerticalArea(self, points: List[List[int]]) -> int:
        arr = sorted([x for x, y in points])
        return max(list(map(lambda x, y: x - y, arr[1:], arr[:-1])))