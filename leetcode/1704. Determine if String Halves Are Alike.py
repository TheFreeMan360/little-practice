class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        s = s.lower()
        vowel_letter = "aeiou"
        n = len(s)
        half = n // 2
        count = 0
        
        for i in range(0, half):
            if s[i] in vowel_letter:
                count += 1

        for i in range(half, len(s)):
            if s[i] in vowel_letter:
                count -= 1

        return count == 0