class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList();
        backtracking(ans, new ArrayList(), n, k, 1);
        return ans;
    }

    private void backtracking(List<List<Integer>> ans, List<Integer> path, int n, int k, int cur){
        if(k == 0){
            ans.add(new ArrayList(path));
            return;
        }

        for(int i = cur ; i <= n ; i++){
            path.add(i);
            backtracking(ans, path, n, k - 1, i + 1);
            path.remove(path.size()-1);
        }
    }

}