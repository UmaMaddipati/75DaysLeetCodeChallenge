class Solution {
    public int maxProfit(int[] prices) {
        int bought = prices[0];
        int pro = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < bought) {
                bought = prices[i];
            } else if (prices[i] - bought > pro) {
                pro = prices[i] - bought;
            }
        }
        return pro;
        
    }
}