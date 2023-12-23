class Solution {
    public boolean isPathCrossing(String path) {
        // use x * 1001 + y change coordinate to num
        Set<Integer> record = new HashSet<>();
        record.add(0);

        int x = 0, y = 0;
        for (int i = 0; i < path.length(); ++i) {
            char c = path.charAt(i);
            if (c == 'N')
                ++y;
            else if (c == 'S')
                --y;
            else if (c == 'E')
                ++x;
            else if (c == 'W')
                --x;

            int cood = x * 1001 + y;

            if (record.contains(cood))
                return true;

            record.add(cood);
        }
        return false;
    }
}