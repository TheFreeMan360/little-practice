class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        int local = 0, global = nums[0];

        for(int num : nums){
            local = Math.max(local, 0) + num;
            global = Math.max(global, local);
        }
        return global;
    }
}