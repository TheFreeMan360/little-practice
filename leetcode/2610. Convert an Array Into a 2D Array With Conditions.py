class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        ans = []
        freq_count = [0 for i in range(len(nums) + 1)]

        for num in nums:
            if len(ans) < freq_count[num] + 1:
                ans.append([])
            
            ans[freq_count[num]].append(num)
            freq_count[num] += 1
        
        return ans