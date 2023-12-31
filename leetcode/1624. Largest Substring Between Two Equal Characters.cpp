class Solution {
public:
    int maxLengthBetweenEqualCharacters(string s) {
        vector<int> shownInx(26, -1);
        int ans = -1;

        for (int i = 0; i < s.length(); ++i) {
            int currCharAscii = s[i] - 97;
            if (shownInx[currCharAscii] == -1) {
                shownInx[currCharAscii] = i;
            } else {
                int distance = i - shownInx[currCharAscii] - 1;
                ans = max(ans, distance);
            }
        }
        return ans;
    }
};