class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length == 3) return nums[0] + nums[1] + nums[2];

        Arrays.sort(nums);

        int res = Integer.MAX_VALUE; 
        int len = nums.length;
        
        for(int i = 0 ; i < len - 2 ; ++i){
            int j = i + 1, k = len - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                
                if(sum == target){
                    return sum;
                }
                else if(sum > target){
                    --k;
                    if(Math.abs(target - sum) < Math.abs(target - res)){
                        res = sum;
                        continue;
                    }
                }
                else if(sum < target){
                    ++j;
                    if(Math.abs(target - sum) < Math.abs(target - res)){
                        res = sum;
                        continue;
                    } 
                }
            }
        }

        return res;
    }
}