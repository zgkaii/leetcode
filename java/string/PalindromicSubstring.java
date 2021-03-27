package string;

// 给你一个字符串 s，找到 s 中最长的回文子串。
// 输入：s = "babad"  输出："bab" /"aba" 同样是符合题意的答案。
public class PalindromicSubstring {
    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = check(s, i, i), even = check(s, i, i + 1);
            if (odd.length() > res.length())
                res = odd;
            if (even.length() > res.length())
                res = even;
        }
        return res;
    }

    public String check(String s, int i, int j) {
        // 双指针向两边扩散
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        // 返回以i+1和j索引为中心的最⻓回文串
        return s.substring(i + 1, j);
        // for (; 0 <= i && j < s.length(); i--, j++) {
        // if (s.charAt(i) != s.charAt(j))
        // break;
        // }
        // return s.substring(i + 1, j);
    }
}
