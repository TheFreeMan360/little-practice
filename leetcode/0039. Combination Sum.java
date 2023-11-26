class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList();
        backtracking(ans, new ArrayList(), candidates, target);
        return ans; 
    }

    private void backtracking(List<List<Integer>> ans, List<Integer> path, int[] nums, int target){
        if(target == 0){
            ans.add(new ArrayList(path));
            return;
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(target - nums[i] < 0 )continue;
            if(path.size() >= 1 && path.get(path.size() - 1) > nums[i])
                continue;
            path.add(nums[i]);
            backtracking(ans, path, nums, target - nums[i]);
            path.remove(path.size() - 1);
        }

    }
}