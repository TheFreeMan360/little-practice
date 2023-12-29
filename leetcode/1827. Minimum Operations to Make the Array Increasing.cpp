class Solution {
public:
    int minOperations(vector<int>& nums) {
        int n = nums.size();
        if (n == 1)
            return 0;

        int ans = 0;
        for (int i = 1; i < n; ++i) {
            if (nums[i - 1] < nums[i])
                continue;
            int tmp = nums[i - 1] + 1;
            ans += tmp - nums[i];
            nums[i] = tmp;
        }
        return ans;
    }
};