class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        
        for (int i = 0; i < nums.length; ++i){
            StringBuffer sb = new StringBuffer();
            sb.append(nums[i]);
            
            int j = i;
            for(; j + 1 < nums.length && nums[j + 1] - nums[j] == 1; ++j);

            if(i != j){
                sb.append("->");
                sb.append(nums[j]);
                ans.add(sb.toString());
                i = j;
                continue;
            }

            ans.add(sb.toString());
        }

        return ans;
    }
}