package dp;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/02/07 15:07
 * @Description:https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * 
 **/
public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;
        for (int price : prices) {
            cost = Math.min(cost, price);
            profit = Math.max(profit, price - cost);
        }
        return profit;
    }
}
