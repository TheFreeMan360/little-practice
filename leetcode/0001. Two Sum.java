class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
         * Using hashmap to log missing parts (target - nums[index]).
         * If we already find a number that satisfies this question,
         * we can return it.
         */
        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                return new int[] { i, map.get(nums[i]) };
            else
                map.put(target - nums[i], i);
        }

        return new int[] { 0, 0 };
    }
}