class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0) return new int[][]{newInterval};

        List<int[]> ls = new ArrayList<>();
        int[] prevInterval = newInterval;
        for(int[] currInterval : intervals){
            if(isInInterval(prevInterval, currInterval)){
                prevInterval = merge(prevInterval, currInterval); 
            }else{
                if(pervThan(prevInterval, currInterval)){
                    ls.add(prevInterval);
                    prevInterval = currInterval;
                }else{
                    ls.add(currInterval);
                }
            }
        }

        ls.add(prevInterval);

        return ls.toArray(new int[ls.size()][2]);
    }

     private boolean isInInterval(int[] i1, int[] i2){
        return i1[0] <= i2[0] && i2[0] <= i1[1]
            || i2[0] <= i1[0] && i1[0] <= i2[1];
    }

     private boolean pervThan(int[] i1, int[] i2){
        return i1[0] < i2[0];
    }

    private int[] merge(int[] i1, int[] i2){
        i1[0] = Math.min(i1[0], i2[0]);
        i1[1] = Math.max(i1[1], i2[1]);
        return i1;
    }

}