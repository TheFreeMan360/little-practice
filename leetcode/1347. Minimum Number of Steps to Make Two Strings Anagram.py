class Solution:
    def minSteps(self, s: str, t: str) -> int:
        ans = 0
        for char in set(t):
            diff = t.count(char) - s.count(char)
            ans += diff if diff > 0 else 0

        return ans 