class Solution {
public:
    bool checkString(string s) {
        // if ba => count != 0
        int count = 0;
        
        for (size_t i = 1; i < s.size(); i++)
            if (s[i - 1] > s[i])
                count++;

        return count == 0;
    }
};