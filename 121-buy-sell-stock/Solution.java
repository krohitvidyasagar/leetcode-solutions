class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            if (prices[i] - prices[left] > maxProfit) {
                maxProfit = prices[i] - prices[left];
            } else if (prices[i] < prices[left]) {
                prices[left] = prices[i];
            }
        }
        
        return maxProfit;
    }
}