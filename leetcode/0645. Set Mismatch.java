class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean[] hasNum = new boolean[nums.length + 1];

        int[] ans = new int[2];
        
        for(int num : nums){
            if(!hasNum[num]) hasNum[num] = true;
            else ans[0] = num;
        }

        for(int num = 1 ; num <= nums.length ; ++num){
            if(!hasNum[num]){
                ans[1] = num;
                break;
            }
        }

        return ans;
    }
}