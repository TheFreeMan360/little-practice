class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        """
        Using hashmap to log missing parts (target - nums[index]).
        If we already find a number that satisfies this question, 
        we can return it.
        """
        hash_map = dict()
        for i, e in enumerate(nums):
            if e in hash_map.keys(): return [i, hash_map[e]]
            else: hash_map[target - e] = i
        return []