class Solution {
public:
    int missingNumber(vector<int>& nums) {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);

        const int n = nums.size();
        int ans = n * (n + 1) / 2;
        ans -= accumulate(nums.begin(), nums.end(), 0);
        return ans;
    }
};