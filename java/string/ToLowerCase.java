package string;

public class ToLowerCase {
    public String toLowerCase1(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            // a-z：97-122 A-Z：65-90 0-9：48-57
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] += 32;// 或ch[i] |= 32;
                // 大写变小写、小写变大写：字符^=32;
                // 大写变小写、小写变小写：字符|=32;
                // 大写变大写、小写变大写：字符&=33;
                // SCII码表中大写的A是65，小写的a是97，它们的差是32
                // 65|32 转为二进制（按8位来算）可以得到 0100 0001|0010 0000=0110 0001=97= a
            }
        }
        return String.valueOf(ch);
    }
}
