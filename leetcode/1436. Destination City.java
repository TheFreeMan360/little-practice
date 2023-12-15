class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> p: paths) set.add(p.get(1));
        for (List<String> p: paths) set.remove(p.get(0));
        return set.iterator().next();
    }
}