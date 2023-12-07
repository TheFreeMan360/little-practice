class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        int len1 = num1.length(), len2 = num2.length();
        int[] pos = new int[len1 + len2];

        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int cur = i + j, next = i + j + 1;
                int sum = mul + pos[next];

                pos[cur] += sum / 10;
                pos[next] = (sum) % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int n : pos)
            sb.append(n);
        while (sb.length() != 0 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);
        return sb.toString();
    }
}