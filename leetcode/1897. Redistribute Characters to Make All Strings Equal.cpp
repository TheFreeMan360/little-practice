class Solution {
public:
    bool makeEqual(vector<string>& words) {
        vector<int> count(26);
        for(string s : words){
            for(char c : s){
                ++count[c - 97];
            }
        }

        int n = words.size();
        for(int freq : count){
            if(freq % n != 0){
                return false;
            }
        }
        return true;
    }
};