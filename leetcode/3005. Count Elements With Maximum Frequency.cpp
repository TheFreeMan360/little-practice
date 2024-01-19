class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        unordered_map<int, int> count;
        for(const int& num : nums){
            count[num]++;
        }

        int ans = 0, currFreq = INT_MIN;
        for(const auto& [num, freq] : count){
            if(freq > currFreq){
                currFreq = freq;
                ans = freq;
            }else if(freq == currFreq){
                ans += freq;
            }
        }
        return ans;
    }
};