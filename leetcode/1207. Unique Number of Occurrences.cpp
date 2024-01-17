class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int, int> count;
        for (const int& num : arr) {
            count[num] += 1;
        }

        unordered_set<int> s;
        for (const auto& [num, c] : count) {
            if (s.find(c) != s.end()) {
                return false;
            }
            s.insert(c);
        }
        return true;
    }
};