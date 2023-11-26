class Solution {
    private Map<Character, char[]> d2l = new HashMap<Character, char[]>(){{
        put('2', new char[]{'a', 'b', 'c'});
        put('3', new char[]{'d', 'e', 'f'});
        put('4', new char[]{'g', 'h', 'i'});
        put('5', new char[]{'j', 'k', 'l'});
        put('6', new char[]{'m', 'n', 'o'});
        put('7', new char[]{'p', 'q', 'r', 's'});
        put('8', new char[]{'t', 'u', 'v'});
        put('9', new char[]{'w', 'x', 'y', 'z'});
    }};

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        char[] digitArr = digits.toCharArray();
        if(digitArr.length == 0) return ans;
        backtracking(ans, new char[digitArr.length], digitArr, 0);
        return ans;
    }

    private void backtracking(List<String> ans, char[] curStr, char[] digitArr, int inx){
        if(inx == digitArr.length){
            ans.add(new String(curStr));
            return;
        }

        for(char c : d2l.get(digitArr[inx])){
            curStr[inx] = c;
            backtracking(ans, curStr, digitArr, inx + 1);
        }
    }
}