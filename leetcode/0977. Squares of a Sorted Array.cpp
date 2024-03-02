class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        const int n = nums.size();
        int i = 0, j = n - 1;
        vector<int> ans(n);
        for(int index = n - 1; index >= 0; --index){
            if(abs(nums[j]) > abs(nums[i])){
                ans[index] = nums[j] * nums[j];
                j -= 1; 
            }else{
                ans[index] = nums[i] * nums[i];
                i += 1;
            }
        }
        return ans;
    }
};