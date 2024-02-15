class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int candidate = -1, count = 0;
        for (const int& num : nums) {
            if (count == 0)
                candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
};