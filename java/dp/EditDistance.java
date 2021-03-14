package dp;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/03/12 22:03
 * @Description: 72. 编辑距离 https://leetcode-cn.com/problems/edit-distance/
 *               给你两个单词word1 和 word2，请你计算出将 word1 转换成 word2 所使用的最少操作数 。
 *               （每次可以进行插入、删除或替换一个字符） 输入：word1 = "horse", word2 = "ros" 输出：3
 **/
public class EditDistance {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        // 存在空字符串
        if (m * n == 0)
            return m + n;
        // 定义DP数组
        int[][] dp = new int[m + 1][n + 1];
        // 边界状态：第一行
        for (int j = 1; j <= n; j++)
            dp[0][j] = dp[0][j - 1] + 1;
        // 边界条件：第一列
        for (int i = 1; i <= m; i++)
            dp[i][0] = dp[i - 1][0] + 1;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    // 当前字母相同，不需要额外操作，等于前一段编辑距离
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    // dp[i][j] = min(dp[i-1][j-1], dp[i][j-1]+1,dp[i-1][j]+1)
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]), dp[i - 1][j]) + 1;
            }
        }
        return dp[m][n];
    }
}
