class Solution {
public:
    int numberOfBeams(vector<string>& bank) {
        if (bank.size() < 2)
            return 0;

        int ans = 0, lastRowOnes = 0;
        for (string row : bank) {
            int countOnes = 0;
            for (char c : row)
                countOnes += c - 48;

            ans += lastRowOnes * countOnes;
            lastRowOnes = (countOnes == 0) ? lastRowOnes : countOnes;
        }
        return ans;
    }
};