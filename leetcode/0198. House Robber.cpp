class Solution {
public:
    int rob(vector<int>& nums) {
        // fibonacci style dp
        int prev2 = 0, prev1 = nums[0];
        for(int i = 1; i < nums.size(); ++i){
            int tmp = max(
                prev2 + nums[i],
                prev1
            );

            prev2 = prev1;
            prev1 = tmp;
        }
        return prev1;
    }
};