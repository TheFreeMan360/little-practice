class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (char e : columnTitle.toCharArray()) {
            sum *= 26;
            sum += ((int) e - 64);
        }
        return sum;
    }
}