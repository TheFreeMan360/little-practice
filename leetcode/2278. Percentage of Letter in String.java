class Solution {
    public int percentageLetter(String s, char letter) {
        double count = 0;
        for(char c : s.toCharArray()) if(c == letter) ++count;
        return (int)Math.floor(count / (double)s.length() * 100);
    }
}