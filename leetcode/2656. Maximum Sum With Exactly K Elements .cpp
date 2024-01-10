class Solution {
public:
    int maximizeSum(vector<int>& nums, int k) {
        int maxNum = *max_element(nums.begin(), nums.end());
        return (2 * maxNum + k - 1) * k / 2; //Arithmetic Progression Sum 
    }
};