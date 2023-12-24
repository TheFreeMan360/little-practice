class Solution {
public:
    vector<int> numsSameConsecDiff(int n, int k) {
        vector<int> ans;
        backtracking(ans, "", n, k);
        return ans;
    }

    void backtracking(vector<int>& ans, string state, int n, int k) {
        if (n == 0) {
            ans.push_back(stoi(state));
            return;
        }

        if (state == "") {
            for (int digit = 1; digit <= 9; ++digit) {
                char c = (digit + 48);
                backtracking(ans, state + c, n - 1, k);
            }
        } else {
            int prevNum = state[state.length() - 1] - 48;
            for (int digit = 0; digit <= 9; ++digit) {
                if (abs(prevNum - digit) != k)
                    continue;

                char c = (digit + 48);
                backtracking(ans, state + c, n - 1, k);
            }
        }
    }
};