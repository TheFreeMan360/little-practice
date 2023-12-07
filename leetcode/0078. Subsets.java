class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        backtracking(ans, new ArrayList(), nums, 0);
        return ans;
    }

    private void backtracking(List<List<Integer>> ans, List<Integer> path, int[] nums, int inx) {
        ans.add(new ArrayList(path));

        for (int i = inx; i < nums.length; i++) {
            path.add(nums[i]);
            backtracking(ans, path, nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}