class Solution {
public:
    vector<vector<int>> divideArray(vector<int>& nums, int k) {
        int n = nums.size();
        sort(nums.begin(), nums.end());
        vector<vector<int>> ans;

        for (int i = 0; i < n; i += 3) {
            if ((nums[i + 1] - nums[i]) > k ||
                (nums[i + 2] - nums[i + 1]) > k ||
                (nums[i + 2] - nums[i]) > k) {
                return {};
            }

            ans.push_back(vector<int>{nums[i], nums[i + 1], nums[i + 2]});
        }

        return ans;
    }
};