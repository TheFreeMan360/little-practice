class Solution {
public:
    int minimumCost(vector<int>& cost) {
        if(cost.size() == 1){
            return cost[0];
        }
        if(cost.size() == 2){
            return cost[0] + cost[1];
        }
        sort(cost.begin(), cost.end());
        int n = cost.size(), minCost = 0;
        for (int i = n - 1; i >= 0; i -= 3) {
            minCost += cost[i]; 
            if(i - 1 >= 0) minCost += cost[i - 1];
        }
        return minCost;
    }
};