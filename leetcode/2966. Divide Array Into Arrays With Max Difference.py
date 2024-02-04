class Solution:
    def divideArray(self, nums: List[int], k: int) -> List[List[int]]:
        ans = list()
        nums.sort()

        for i in range(0, len(nums) - 2, 3):
            if nums[i + 1] - nums[i] > k or\
               nums[i + 2] - nums[i] > k or\
               nums[i + 2] - nums[i + 1] > k:
                return []
            
            ans.append([nums[i], nums[i + 1], nums[i + 2]]) 


        return ans