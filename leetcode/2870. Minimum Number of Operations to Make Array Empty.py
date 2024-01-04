class Solution:
    def minOperations(self, nums: List[int]) -> int:
        num_freq_count = dict()

        for num in nums:
            num_freq_count[num] = num_freq_count.get(num, 0) + 1

        ans = 0
        for num_freq in num_freq_count.values():
            if num_freq == 1:
                return -1

            ans += num_freq // 3
            if num_freq % 3:
                ans += 1
        return ans
