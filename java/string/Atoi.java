package string;

public class Atoi {
    public int myAtoi(String s) {
        int idx = 0, total = 0, sign = 1;
        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;

        if (s.length() == 0)
            return 0;
        // 去前导空格
        while (idx < s.length() && s.charAt(idx) == ' ')
            idx++;
        // 极端情况 s=" "
        if (idx == s.length())
            return 0;
        // 获取正负
        if (s.charAt(idx) == '+' || s.charAt(idx) == '-') {
            sign = s.charAt(idx) == '+' ? 1 : -1;
            idx++;
        }
        // 转换数字
        while (idx < s.length()) {
            int digit = s.charAt(idx) - '0';
            if (digit < 0 || digit > 9)
                break;
            // 检查溢出
            if (MAX / 10 < total || MAX / 10 == total && MAX % 10 < digit) {
                return sign == 1 ? MAX : MIN;
            }
            total = total * 10 + digit;
            idx++;
        }
        return total * sign;
    }
}
