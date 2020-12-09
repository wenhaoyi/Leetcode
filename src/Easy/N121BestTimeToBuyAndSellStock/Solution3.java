package Easy.N121BestTimeToBuyAndSellStock;

public class Solution3 {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) {
            return 0;
        }
        int n = prices.length;
        int [] sell = new int[n];
        int [] buy = new int[n];
        sell[0] = 0;
        buy[0] = -prices[0];
        for (int i = 1; i < n; ++i) {
            sell[i] = Math.max(sell[i-1],buy[i-1]+prices[i]);
            buy[i] = Math.max(buy[i-1], -prices[i]);
        }
        return Math.max(sell[n-1],buy[n-1]);
    }
}
