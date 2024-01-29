class Solution {
public:
    vector<vector<int>> mergeSimilarItems(vector<vector<int>>& items1,
                                          vector<vector<int>>& items2) {
        map<int, int> tmp;
        for (int i = 0; i < items1.size(); ++i) {
            tmp[items1[i][0]] += items1[i][1];
        }
        for (int i = 0; i < items2.size(); ++i) {
            tmp[items2[i][0]] += items2[i][1];
        }

        vector<vector<int>> ans;
        for (const pair<int, int>& p : tmp) {
            ans.push_back(vector<int>({p.first, p.second}));
        }
        return ans;
    }
};