class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] letterFreq = new int[26];
        for(char c : s.toCharArray()) ++letterFreq[c - 'a'];
        for(char c : t.toCharArray()) --letterFreq[c - 'a'];
        for(int freq : letterFreq) if(freq != 0) return false;
        return true;
    }
}