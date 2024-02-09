class Solution:
    def frequencySort(self, s: str) -> str:
        return "".join(
            [
                char * freq
                for char, freq in sorted(
                    Counter(s).items(), key=lambda e: e[1], reverse=True
                )
            ]
        )

    def frequencySort2(self, s: str) -> str:
        count = dict()
        for char in s:
            count[char] = count.get(char, 0) + 1

        ans = ""
        for char, freq in sorted(count.items(), key=lambda e: e[1], reverse=True):
            ans += char * freq
        return ans

    def frequencySort3(self, s: str) -> str:
        return "".join([char * freq for char, freq in Counter(s).most_common()])