class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int size = cardPoints.length;
        
        int[] perfixSum = new int[size];
        perfixSum[0] = cardPoints[0];
        for(int i =  1 ; i < size ; ++i)
            perfixSum[i] = perfixSum[i - 1] + cardPoints[i];

        if(size == k) return perfixSum[size - 1];

        int score = 0;
        int l = 0, r = size - 1;
        while(l < r && k > 0) {

            int s = r - l + 1;
            int leftValue = (l == 0)? perfixSum[l + k - 1] 
                                    : perfixSum[l + k - 1] - perfixSum[l - 1];
            int rightValue = perfixSum[r] - perfixSum[r - k];

            if(leftValue > rightValue) score += cardPoints[l++];
            else if(leftValue <= rightValue) score += cardPoints[r--];

            --k;
        }

        return score;
    }
}