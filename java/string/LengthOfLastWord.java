package string;

/**
 * 58. 最后一个单词的长度 https://leetcode-cn.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
    // 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。
    // 返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
    public int lengthOfLastWord(String s) {
        s = s.trim(); // 去除两侧空格
        int len = s.length() - 1;
        for (; len >= 0; --len) {
            if (s.charAt(len) == ' ') // 从后往前遍历，遇到空格break
                break;
        }
        return s.length() - 1 - len;
    }
}
