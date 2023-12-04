class Solution:
    def largestGoodInteger(self, num: str) -> str:
        for i in range(9, -1, -1): 
            curr = chr(i + 48) * 3
            if num.find(curr) != -1: return curr
        return ""