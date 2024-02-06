class Solution {
public:
    int firstUniqChar(string s) {
        int map[26] = {0};
        for(const char& letter : s){
            map[letter - 'a'] += 1;
        }
        for(int i = 0; i < s.length(); ++i){
            if(map[s[i] - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    int firstUniqChar2(string s) {
        int inx = INT_MAX;
        for (char letter = 'a'; letter <= 'z'; ++letter) {
            int pos = s.find(letter);
            if(pos != string::npos && pos == s.rfind(letter)){
                inx = min(inx, pos);
            }
        }
        return (inx == INT_MAX) ? -1 : inx;
    }
};