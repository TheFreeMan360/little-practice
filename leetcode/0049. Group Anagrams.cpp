class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> groups;
        for (const string& str : strs) {
            string strCopy{str};
            sort(strCopy.begin(), strCopy.end());
            groups[strCopy].push_back(str);
        }

        vector<vector<string>> ans;
        for (const auto& [_, group] : groups) {
            ans.push_back(group);
        }
        return ans;
    }
};