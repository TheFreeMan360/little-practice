class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for(int i = 1 ; i < strs.length ; i++){
            ans = samePart(ans, strs[i]);
        }
        return ans;
    }

    private String samePart(String a, String b){
        if(a.equals(b))return a;

        int len = Math.min(a.length(), b.length());

        int i;
        for(i = 0 ; i < len; i++)if(a.charAt(i) != b.charAt(i))break;

        return a.substring(0, i);
    }
}