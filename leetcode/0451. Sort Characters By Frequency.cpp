class Solution {
public:
    string frequencySort(string s) {
        unordered_map<char, int> count;
        for (const char& c : s) {
            count[c] += 1;
        }

        vector<pair<int, char>> countsAndChars;
        for (const auto& [ch, freq] : count) {
            countsAndChars.push_back(make_pair(freq, ch));
        }

        sort(countsAndChars.begin(), countsAndChars.end(),
             greater<pair<int, char>>());

        string ans;
        for (const auto& [freq, ch] : countsAndChars) {
            ans += string(freq, ch);
        }
        return ans;
    }
};