package Easy.N121BestTimeToBuyAndSellStock;
//the copy of solution3
public class Solution4 {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if(prices==null || length ==0) {
            return 0;
        }
        int [] sell = new int[length];
        int [] buy = new int[length];
        sell[0] = 0;
        buy[0] = -prices[0];
        for (int i = 1; i < length; i++) {
            sell[i] = Math.max(sell[i-1],buy[i-1]+prices[i]);
            buy[i] = Math.max(buy[i-1],-prices[i]);
        }
        return Math.max(sell[length-1],buy[length-1]);
    }
}
