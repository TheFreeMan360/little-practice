class Solution {
public:
    string firstPalindrome(vector<string>& words) {
        for (string& word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    bool isPalindrome(string& s) {
        int lo = 0, hi = s.length() - 1;
        while (lo < hi) {
            if (s[lo] != s[hi]) {
                return false;
            }
            ++lo;
            --hi;
        }
        return true;
    }
};