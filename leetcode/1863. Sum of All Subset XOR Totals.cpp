class Solution {
public:
    int helper(vector<int>& nums, int i, int sum) {
        return (i >= nums.size()) ? sum
                                  : helper(nums, i + 1, sum ^ nums[i]) +
                                        helper(nums, i + 1, sum);
    }
    int subsetXORSum(vector<int>& nums) { 
        return helper(nums, 0, 0); 
    }
};