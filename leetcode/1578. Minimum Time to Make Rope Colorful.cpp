class Solution {
public:
    int minCost(string colors, vector<int>& neededTime) {
        int ans = 0, maxCost = 0;
        for (int i = 0; i < colors.length(); ++i) {
            if (i > 0 && colors[i] != colors[i - 1])
                maxCost = 0;
            ans += min(maxCost, neededTime[i]);
            maxCost = max(maxCost, neededTime[i]);
        }
        return ans;
    }
};