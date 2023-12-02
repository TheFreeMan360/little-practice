class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(int i = 0 ; i < text.length() ; ++i)
            ++freq[text.charAt(i) - 97];

        int res = Integer.MAX_VALUE;
        res = Math.min(res, freq['b' - 97]);
        res = Math.min(res, freq['a' - 97]);
        res = Math.min(res, freq['l' - 97]/2);
        res = Math.min(res, freq['o' - 97]/2);
        res = Math.min(res, freq['n' - 97]);
        
        return res;
    }
}