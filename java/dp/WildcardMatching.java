package dp;

/**
 * 44. 通配符匹配 https://leetcode-cn.com/problems/wildcard-matching/
 */
public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null)
            return false;
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[n + 1][m + 1];
        // 1.空字符串匹配空模式
        dp[0][0] = true;
        // 2.dp[j][0] 任何连续的“*”都能匹配空字符串
        for (int j = 1; j < n + 1; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[j][0] = dp[j - 1][0];
            }
        }
        // 1. p[j] == s[i] => dp[i][j] = dp[i - 1][j - 1]
        // 2. p[j] == '?'
        // => ?' 匹配单个字符: dp[i][j] = dp[i - 1][j - 1]
        // 3. p[j] == '*'
        // => a. '*' 匹配空字符: dp[i][j]=dp[i-1][j]
        // => b. '*' 匹配多字符: dp[i][j]=dp[i][j-1]
        // => dp[i][j]=dp[i-1][j] || dp[i][j-1]
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                char ch_s = s.charAt(i - 1);
                char ch_p = p.charAt(j - 1);
                if (ch_s == ch_p || ch_p == '?')
                    dp[j][i] = dp[j - 1][i - 1];
                else if (ch_p == '*')
                    dp[j][i] = dp[j - 1][i] || dp[j][i - 1];
            }
        }
        return dp[n][m];
    }
}
