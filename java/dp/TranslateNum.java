package dp;

public class TranslateNum {
    public int translateNum(int num) {
        // dp[i] 表示x(i)结尾的数字翻译数量
        // 1. x(i)与x(i-1)能够组合翻译 10*x(i-1) + x(i) -> [10,25]
        // dp[i] = dp[i-1]+dp[i-2];
        // 2. x(i)与x(i-1)只能单独翻译 10*x(i-1) + x(i) -> [1,10) || (25,99]
        // dp[i] = dp[i-1];
        // a -> dp[i], b -> dp[i-1],节省O(n)空间
        String s = String.valueOf(num);
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= s.length(); i++) {
            String tmp = s.substring(i - 2, i);
            if (tmp.compareTo("10") >= 0 && tmp.compareTo("25") <= 0) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[s.length()];
    }

    public int translateNum2(int num) {
        int a = 1, b = 1, x, y = num % 10;
        while (num != 0) {
            num /= 10;
            x = num % 10;
            int tmp = x * 10 + y;
            int c = (tmp >= 10 && tmp <= 25) ? a + b : a;
            b = a;
            a = c;
            y = x;
        }
        return a;
    }
}
