class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] outputImg = new int[img.length][img[0].length];
        for(int r = 0; r < img.length; ++r){
            for(int c = 0; c < img[0].length; ++c){
                outputImg[r][c] = getFilteredValue(img, r, c);
            }
        }
        return outputImg;
    }

    private int getFilteredValue(int[][] img, int x, int y){
        int m = img.length, n = img[0].length;
        double sum = 0, count = 0;
        for(int r = Math.max(0, x - 1); r < Math.min(m , x + 2); r++){
            for(int c = Math.max(0, y - 1); c < Math.min(n, y + 2); c++){
                sum += img[r][c];
                ++count;
            }
        }
        return (int) Math.floor(sum / count);
    }
}