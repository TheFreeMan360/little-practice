class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList();
        backtracking(ans, new ArrayList(), nums, 0);
        return new ArrayList(ans);
    }

    private void backtracking(List<List<Integer>> ans, List<Integer> path, int[] nums, int inx) {
        ans.add(new ArrayList(path));

        for (int i = inx; i < nums.length; i++) {
            if (i > inx && nums[i] == nums[i - 1])
                continue;
            path.add(nums[i]);
            backtracking(ans, path, nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}