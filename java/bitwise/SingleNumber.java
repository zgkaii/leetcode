package bitwise;

public class SingleNumber {
    public int[] singleNumber(int[] nums) {
        // a ^ a ^ b = 0 ^ b = b`
        int mask = 0;
        // nums 1 3 4 1 2 3
        // num 0001 => 0010 => 0110 => 0111 => 0101 => 0110
        for (int num : nums) {
            mask ^= num;
        }
        // 保留最右1 => 0010
        mask &= -mask;
        int[] res = { 0, 0 };
        for (int num : nums) {
            // 把数组分为两部分，每部分分别异或
            if ((num & mask) == 0)
                res[0] ^= num;
            else
                res[1] ^= num;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 1, 2, 3 };
        int[] res = null;
        SingleNumber s = new SingleNumber();
        res = s.singleNumber(nums);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
