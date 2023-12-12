class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allowedChar = new boolean[26];
        for (char c : allowed.toCharArray())
            allowedChar[c - 97] = true;
        
        int ans = 0;
        for (String s : words){
            boolean isValid = true;
            for (char c : s.toCharArray()){
                if (!allowedChar[c - 97]){
                    isValid = false;
                    break;
                }
            }
            if(isValid) ++ans;
        }
        return ans;
    }
}