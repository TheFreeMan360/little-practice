class Solution {
    public int missingNumber(int[] nums) {
        final int n = nums.length;
        int ans = n * (n + 1) / 2; // arithmetic sum for 0 ~ n
        for(int num : nums){
            ans -= num;
        }
        return ans;
    }
}