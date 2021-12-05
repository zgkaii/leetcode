package string;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        // 统计每个字符个数
        int[] arr = new int[26];

        for (char c : magazine.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            arr[c - 'a']--;
            if (arr[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}