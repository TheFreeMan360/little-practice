class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] pointsX = new int[points.length];
        
        for (int i = 0; i < points.length; ++i)
            pointsX[i] = points[i][0]; 
        
        Arrays.sort(pointsX);

        int max = 0;
        for (int i = 1; i < points.length; ++i){
            int currWidth = pointsX[i] - pointsX[i - 1]; 
            max = Math.max(max, currWidth);
        }
        
        return max;
    }
}