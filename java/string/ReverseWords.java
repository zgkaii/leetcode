package string;

import java.util.Stack;

// 给定一个字符串，逐个翻转字符串中的每个单词。
// 无空格字符构成一个 单词 。
// 入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
// 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
public class ReverseWords {
    public char[] reverse(char[] arr, int i, int j) {
        while (i < j) {
            char tmp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = tmp;
        }
        return arr;
    }

    public String reverseWords(String s) {
        // reverse the whole string and convert to char array
        char[] str = reverse(s.toCharArray(), 0, s.length() - 1);
        int start = 0, end = 0; // start and end positions of a current word
        for (int i = 0; i < str.length; i++) {
            if (str[i] != ' ') { // if the current char is letter
                str[end++] = str[i]; // just move this letter to the next free pos
            } else if (i > 0 && str[i - 1] != ' ') { // if the first space after word
                reverse(str, start, end - 1); // reverse the word
                str[end++] = ' '; // and put the space after it
                start = end; // move start position further for the next word
            }
        }
        reverse(str, start, end - 1); // reverse the tail word if it's there
        // here's an ugly return just because we need to return Java's String
        // also as there could be spaces at the end of original string
        // we need to consider redundant space we have put there before
        return new String(str, 0, end > 0 && str[end - 1] == ' ' ? end - 1 : end);
    }

    public String reverseWords1(String s) {
        Stack<String> stack = new Stack<>();
        String word = "", res = "";
        ;
        char[] str = s.toCharArray();
        // 遍历字符串，截取单词，word入栈
        for (int i = 0; i < s.length(); ++i) {
            if (str[i] != ' ') {
                word += str[i];
                // 字母后为空格或最后一个字母 入栈
                if (i == s.length() - 1 || str[i + 1] == ' ') {
                    stack.push(word);
                    word = "";
                }
            }
        }
        // word出栈
        while (!stack.empty()) {
            res += stack.peek();
            stack.pop();
            if (!stack.empty())
                res += ' ';
        }
        return res;
    }

    public String reverseWords2(String s) {
        Stack<String> st = new Stack<String>();
        for (String a : s.trim().split(" ")) {
            if (!a.isEmpty())
                st.push(a);
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
