class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList();
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = n - 1, top = 0, down = m - 1;

        while (true) {
            for (int c = left; c <= right; c++)
                ans.add(matrix[top][c]);
            top++;
            if (left > right || top > down)
                break;

            for (int r = top; r <= down; r++)
                ans.add(matrix[r][right]);
            right--;
            if (left > right || top > down)
                break;

            for (int c = right; c >= left; c--)
                ans.add(matrix[down][c]);
            down--;
            if (left > right || top > down)
                break;

            for (int r = down; r >= top; r--)
                ans.add(matrix[r][left]);
            left++;
            if (left > right || top > down)
                break;
        }
        return ans;
    }
}