class Solution {
    public String firstPalindrome(String[] words) {
        // StringBuffer sb = null;
        for (String s : words) {
            // sb = new StringBuffer(s);
            if (isPalindrome(s))
                return s;
        }
        return "";
    }

    boolean isPalindrome(String s) {
        int lo = 0, hi = s.length() - 1;
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                return false;
            }
            ++lo;
            --hi;
        }
        return true;
    }
}