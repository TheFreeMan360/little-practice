class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuffer sb = new StringBuffer();

        for( ; columnNumber > 0 ; columnNumber /= 26){
            --columnNumber;
            int curr = columnNumber % 26;
            sb.insert(0, (char)(curr + 65));
        }
        return sb.toString();
    }
}
