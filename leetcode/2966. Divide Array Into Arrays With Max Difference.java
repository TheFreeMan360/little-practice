class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ansInx = 0, n = nums.length;
        int[][] ans = new int[n / 3][];

        for (int i = 0; i < n - 2; i += 3) {
            if ((nums[i + 1] - nums[i]) > k ||
                    (nums[i + 2] - nums[i]) > k ||
                    (nums[i + 2] - nums[i + 1]) > k) {
                return new int[][] {};
            }

            ans[ansInx++] = new int[] { nums[i], nums[i + 1], nums[i + 2] };
        }
        return ans;
    }
}