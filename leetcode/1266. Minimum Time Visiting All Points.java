class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        if(points.length == 1) return 1;
        int time = 0;
        for(int i = 1 ; i < points.length ; ++i)
            time += getTimeForTwoPoint(points[i - 1], points[i]);
        return time; 
    }

    private int getTimeForTwoPoint(int[] p1, int[] p2){
        int x = Math.abs(p2[0] - p1[0]); 
        int y = Math.abs(p2[1] - p1[1]);
        return Math.max(x, y); 
    }
}