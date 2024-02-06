class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap();
        for(String str : strs){
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sortedStr = String.valueOf(strArr);
            
            groups.putIfAbsent(sortedStr, new ArrayList<String>());
            groups.get(sortedStr).add(str);
        }
        return new ArrayList<>(groups.values());
    }
}