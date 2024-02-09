class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        bitset<100001> s;
        vector<int> ans;
        for(const int& num : nums){
            if(s.test(num)){
                ans.push_back(num);
            }else{
                s.set(num);
            }
        }
        return ans;
    }
};