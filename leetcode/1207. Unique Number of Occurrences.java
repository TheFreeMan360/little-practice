class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int num : arr){
            count.putIfAbsent(num, 0);
            count.put(num, count.get(num) + 1);
        }

        boolean[] occurred = new boolean[1001];
        for(Map.Entry<Integer, Integer> e : count.entrySet()){
            if(occurred[e.getValue()]){
                return false;
            }
            occurred[e.getValue()] = true;
        }
        return true;
    }
}