class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Math.min(prices[0], prices[1]);
        int secMin = Math.max(prices[0], prices[1]);
        for(int i = 2; i < prices.length; ++i){
            if(prices[i] < min){
                secMin = min;
                min = prices[i];
            }
            else if(prices[i] < secMin){
                secMin = prices[i];
            }
        }
        int amount = min + secMin;
        return (amount > money)? money: money - amount;
    }
}