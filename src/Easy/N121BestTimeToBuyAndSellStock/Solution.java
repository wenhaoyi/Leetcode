package Easy.N121BestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        if(prices.length<=1){
            return 0;
        }
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                profit = Math.max(profit,prices[j]-prices[i]);
            }
        }
        return profit;
    }
}
