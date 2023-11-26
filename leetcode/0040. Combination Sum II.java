class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList();
        backtrack(ans, new ArrayList(), candidates, target, 0);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> path, int[]nums, int target, int curInx){
        if(target == 0){
            ans.add(new ArrayList(path));
            return;
        }

        for(int i = curInx ; i < nums.length ; i++){
            if(target - nums[i] < 0)continue;
            if(i > curInx && nums[i-1] == nums[i])continue;

            path.add(nums[i]);
            backtrack(ans, path, nums, target - nums[i], i + 1);
            path.remove(path.size()-1);
        }
    }
}