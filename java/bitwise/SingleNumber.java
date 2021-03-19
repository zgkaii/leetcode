package bitwise;

public class SingleNumber {
    public int[] singleNumber(int[] nums) {
        // a ^ a ^ b = 0 ^ b = b`
        // 分组异或
        int mask = 0;
        for (int num : nums) {
            mask ^= num;
        }

        mask &= -mask;
        int[] res = { 0, 0 };
        for (int num : nums) {
            if ((num & mask) == 0)
                res[0] ^= num;
            else
                res[1] ^= num;
        }
        return res;
    }

    public static void main(String[] args) {
        int mask = 0;
        int[] nums = { 1, 3, 4, 1, 2, 3 };
        // int[] res= null;
        for (int num : nums) {
            mask ^= num;
            System.out.println(mask);
        }
        // for (int i : nums) {
        //     System.out.println(i);
        // }

        // SingleNumber s = new SingleNumber();
        // res = s.singleNumber(nums);
        // for (int i : res) {
        // System.out.println(i);
        // }
    }
}
