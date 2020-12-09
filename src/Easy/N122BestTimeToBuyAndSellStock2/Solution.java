package Easy.N122BestTimeToBuyAndSellStock2;

public class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int buyPrice = 0;
        int sellPrice = 0;
        int profit = 0;
        boolean haveStock = false;
        for (int i = 0; i < length; i++) {
            if(i==length-1){
                if(haveStock){
                    sellPrice = prices[i];
                    profit += (sellPrice -buyPrice);
                    break;
                }else{
                    break;
                }
            }
            if(!haveStock){
                if(prices[i]<prices[i+1]){
                    buyPrice = prices[i];
                    haveStock = true;
                    continue;
                }
            }
            if(haveStock){
                if(prices[i]>=prices[i+1]){
                    sellPrice = prices[i];
                    profit += (sellPrice -buyPrice);
                    haveStock = false;
                }
            }
        }
        return profit;
    }
}
