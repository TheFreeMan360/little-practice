class Solution {
    public int[][] generateMatrix(int n) {
        int left = 0, right = n - 1, top = 0, down = n - 1;
        int[][] matrix = new int[n][n];
        int num = 1;

        while(true){
            for(int c = left ; c <= right ; c++)matrix[top][c] = num++;
            top++;
            if(left > right || top > down) break;
            
            for(int r = top ; r <= down ; r++)matrix[r][right] = num++;
            right--;
            if(left > right || top > down) break;
            
            for(int c = right ; c >= left ; c--)matrix[down][c] = num++;
            down--;
            if(left > right || top > down) break;
            
            for(int r = down ; r >= top ; r--)matrix[r][left] = num++;
            left++;
            if(left > right || top > down) break;
        }
        return matrix;
    }
}