class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int index = i + (j - i) / 2;
            if (nums[index] == target)
                return index;
            if (nums[index] > target)
                j = index - 1;
            else
                i = index + 1;
        }
        return i;
    }
}