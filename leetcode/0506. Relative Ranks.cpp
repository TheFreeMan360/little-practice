class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& score) {
        const int n = score.size();
        vector<pair<int, int>> guysToScore;
        for (int i = 0; i < n; ++i) {
            guysToScore.push_back(make_pair(score[i], i));
        }

        sort(guysToScore.rbegin(), guysToScore.rend());

        vector<string> ans(n);
        for(int i = 0; i < n; ++i){
            const int guyInx = guysToScore[i].second;
            switch(i){
                case 0:
                    ans[guyInx] = "Gold Medal";
                    break;
                case 1:
                    ans[guyInx] = "Silver Medal";
                    break;
                case 2:
                    ans[guyInx] = "Bronze Medal";
                    break;
                default:
                    ans[guyInx] = to_string(i + 1);
                    break;
            } 
        }
        return ans;
    }
};