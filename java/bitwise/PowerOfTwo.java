package bitwise;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/02/19 10:32
 * @Description: 231. 2的幂 https://leetcode-cn.com/problems/power-of-two/
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        // n & (n - 1) 消除最后一位1
        // 1100 0011 0000 1000
        // & 1100 0010 0000 0111
        // 1100 0010 !=0 0000 0000 ==0
        return (n & (n - 1)) == 0;
    }
}
