class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap();

        for (String s : strs) {
            char[] arrS = s.toCharArray();
            Arrays.sort(arrS);
            String sortS = String.valueOf(arrS);
            if (!map.containsKey(sortS))
                map.put(sortS, new ArrayList<String>());
            map.get(sortS).add(s);
        }

        return new ArrayList<>(map.values());
    }
}