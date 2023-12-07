class Solution:
    def largestOddNumber(self, num: str) -> str:
        oddSet = set("13579")
        for i in range(len(num) - 1, -1, -1):
            if num[i] in oddSet: return num[:i + 1]
        
        return ""