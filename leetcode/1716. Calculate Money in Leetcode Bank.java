class Solution {
    public int totalMoney(int n) {
        int sum = 0, nthMonday = 1;
        
        for(int w = n / 7 ; w > 0 ; --w){
            sum += (2 * nthMonday + 6)  * 7 / 2;
            ++nthMonday;
        }
        
        sum += (2 * nthMonday + (n % 7 - 1)) * (n % 7) / 2;
        
        return sum;
    }
