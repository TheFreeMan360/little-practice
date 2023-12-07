class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        backtracking(ans, new ArrayList(), nums, new boolean[nums.length]);
        return ans;
    }

    private void backtracking(List<List<Integer>> ans, List<Integer> path, int[] nums, boolean[] used) {
        if (path.size() == nums.length) {
            ans.add(new ArrayList(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            if (i >= 1 && nums[i] == nums[i - 1] && used[i - 1] == false)
                continue;
            used[i] = true;
            path.add(nums[i]);
            backtracking(ans, path, nums, used);

            used[i] = false;
            path.remove(path.size() - 1);
        }

    }

}