class Solution:
    def firstUniqChar(self, s: str) -> int:
        inx = float("inf")
        for ascii_code in range(ord('a'), ord('z') + 1):
            letter = chr(ascii_code)
            pos = s.find(letter)

            if pos != -1 and pos == s.rfind(letter):
                inx = min(inx, pos)

        return -1 if inx == float("inf") else inx