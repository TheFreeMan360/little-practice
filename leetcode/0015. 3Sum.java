class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet();
        if(nums.length < 3)return new ArrayList(ans);
        
        Arrays.sort(nums);

        int len = nums.length;
        for(int i = 0 ; i < len - 2 ; i++){
            int j = i + 1, k = len - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0)
                    ans.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if(sum > 0) k--;
                else if(sum < 0) j++;
            }
        }

        return new ArrayList(ans);
    }
}