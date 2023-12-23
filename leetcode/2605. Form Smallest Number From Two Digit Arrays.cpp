class Solution {
public:
    int minNumber(vector<int>& nums1, vector<int>& nums2) {
        vector<bool> hasNum(11);
        int bothMin = INT_MAX;

        int a = INT_MAX;
        for (int num : nums1){
            a = min(a, num);
            hasNum[num] = true;
        }

        int b = INT_MAX;
        for (int num : nums2){
            b = min(b, num);
            if(hasNum[num]){
                bothMin = min(bothMin, num);
            }
        }
            
        return (bothMin == INT_MAX) ? min(a, b) * 10 + max(a, b) : bothMin;
    }
};