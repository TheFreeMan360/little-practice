class Solution {
public:
    bool halvesAreAlike(string s) {
        int n = s.length(), half = n / 2, count = 0;
        for(int i = 0; i < half; ++i){
            if(isVowelLetter(s[i])){
                ++count;
            }
        }
        for(int i = half; i < n; ++i){
            if(isVowelLetter(s[i])){
                --count;
            }
        }
        return count == 0;
    }

    bool isVowelLetter(char c){
        c = (char)((int)c | 32); // change uppercase to lowercase 
        if(c == 'a') return true; 
        if(c == 'e') return true; 
        if(c == 'i') return true; 
        if(c == 'o') return true;
        if(c == 'u') return true; 
        return false;
    }
};