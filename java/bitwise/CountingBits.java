package bitwise;

public class CountingBits {
    // 1.使用API
    public int[] countBits1(int num) {
        int[] res = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            res[i] = Integer.bitCount(i);
        }
        return res;
    }

    // 直接运算
    public int[] countBits2(int num) {
        int[] res = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            res[i] = countOnes(i);
        }
        return res;
    }

    public int countOnes(int x) {
        int ones = 0;
        while (x > 0) {
            x &= (x - 1);
            ones++;
        }
        return ones;
    }

    // 3.动态规划
    public int[] countBits3(int num) {
        int[] bits = new int[num + 1];
        int highBit = 0;
        for (int i = 1; i <= num; i++) {
            if ((i & (i - 1)) == 0) {
                highBit = i;
            }
            bits[i] = bits[i - highBit] + 1;
        }
        return bits;
    }
}
