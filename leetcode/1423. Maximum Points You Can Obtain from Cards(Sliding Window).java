class Solution {
    public int maxScore(int[] cardPoints, int k) {
        /*
            Sliding Window
            1. 計算總和 totalSum
            2. 找出最小的中間 n - k 整塊總和 minSum
            3. totalSum - minSum 即為答(因中間 n-k 部分能把左右的 k 摩西分海)
        */
        int n = cardPoints.length;

        int totalSum = 0;
        for (int i = 0; i < n; ++i)
            totalSum += cardPoints[i];

        if (n == k)
            return totalSum;

        int windowSize = n - k;
        int windowSum = 0;
        for (int i = 0; i < windowSize; ++i)
            windowSum += cardPoints[i];
        int minSum = windowSum;

        for (int i = windowSize; i < n; ++i) {
            windowSum = windowSum + cardPoints[i] - cardPoints[i - windowSize];
            minSum = Math.min(minSum, windowSum);
        }

        return totalSum - minSum;
    }
}