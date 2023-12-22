class Solution {
    public int maxScore(String s) {
        int ones = 0;
        int zeroScore = Integer.MIN_VALUE, zeroTmp = 0;

        for (int i = 0; i < s.length() - 1; ++i) {
            char curr = s.charAt(i);
            if (curr == '0') {
                ++zeroTmp;
            } else {
                ++ones;
                --zeroTmp;
            }

            zeroScore = Math.max(zeroScore, zeroTmp);
        }
        ones += (s.charAt(s.length() - 1) == '1' ? 1 : 0);
        return zeroScore + ones;
    }
}