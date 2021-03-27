package string;

import java.util.Arrays;

/**
 * 14. 最长公共前缀
 * https://leetcode-cn.com/problems/longest-common-prefix/description/
 */
public class LongestCommonPrefix {
    // 编写一个函数来查找字符串数组中的最长公共前缀。
    // 如果不存在公共前缀，返回空字符串 ""。
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        int len = strs[0].length(), num = strs.length;
        if (len == 0)
            return "";
        for (int i = 0; i < len; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < num; j++) {
                if (strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
