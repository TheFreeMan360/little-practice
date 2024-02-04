class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        if(k == 1 && nums.size() == 1)
            return (double)nums[0];

        double maxAvg = SHRT_MIN, subSum = 0;
        
        for(int i = 0; i <= k - 2; ++i)
            subSum += nums[i];
        
        for(int i = k - 1; i <= nums.size() - 1; ++i){
            subSum += nums[i];
            maxAvg = max(maxAvg, subSum / k);
            subSum -= nums[i - k + 1];
        }
        return maxAvg;
    }
};