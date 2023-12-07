class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        int[] ans = { -1, -1 };
        while (i <= j) {
            if (nums[i] != target)
                i++;
            else
                ans[0] = i;

            if (nums[j] != target)
                j--;
            else
                ans[1] = j;

            if (ans[0] != -1 && ans[1] != -1)
                return ans;
        }
        return ans;
    }
}