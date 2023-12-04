class Solution {
    public String largestGoodInteger(String num) {
        for(char d = '9' ; d >= '0' ; --d){
            String curr = new String(new char[]{d, d, d});
            if(num.indexOf(curr) != -1) return curr;
        }
        return "";
    }
}