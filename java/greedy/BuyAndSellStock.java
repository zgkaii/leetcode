package greedy;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/02/02 19:26
 * @Description: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 **/
public class BuyAndSellStock {
    public int maxProfit1(int[] prices) {
        // 1.动态规划
        // f(i,0)表示第i天卖出股票后最大利润，f(i,1)表示持有股票最大利润
        // 当天抛售,前一天抛售 和 前一天购入今天抛售 中的最大值
        // f(i,0) = max(f(i-1,0), f(i-1,1) + prices[i])
        // 当前未抛售, 前一天未抛售 和 前一天抛售今天购入 中的最大值
        // f(i,1) = max(f(i-1,1), f(i-1,0) - prices[i])
        // 状态只与前一天状态相关,f(i-1,1),f(i-1,0)存在变量preBuy, preSold中
        if (prices == null || prices.length == 0)
            return 0;

        int preSold = 0, preBuy = -prices[0];
        for (int i = 0; i < prices.length; i++) {
            int curSold = Math.max(preSold, preBuy + prices[i]);
            int curBuy = Math.max(preBuy, preSold - prices[i]);
            preSold = curSold;
            preBuy = curBuy;
        }
        return preSold;
    }

    public int maxProfit2(int[] prices) {
        // 2.贪心算法 只要后一天比前一天大，前一天买入后一天抛出
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i])
                total += (prices[i + 1] - prices[i]);
        }
        return total;
    }
}
