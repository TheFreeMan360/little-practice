class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        max_ = float("-inf")

        while l < r:
            if height[l] < height[r]:
                max_ = max(max_,  height[l] * (r-l))
                l += 1
            else:
                max_ = max(max_,  height[r] * (r-l))
                r -= 1
        return max_
