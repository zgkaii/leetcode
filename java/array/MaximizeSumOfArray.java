package array;

import java.util.Arrays;

public class MaximizeSumOfArray {
    public int largestSumAfterKNegations(int[] nums, int k) {
        // 1.排序
        Arrays.sort(nums);
        int sum = 0, min = Integer.MAX_VALUE;
        // 2.贪心算法，k有盈余，则将负数转化为正数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = -1 * nums[i];
                k--;
            }
            sum += nums[i];
            // 记录最小正数
            min = Math.min(min, Math.abs(nums[i]));
        }
        // 3.k没剩余，则证明最小负数转为正，已经是最大和，返回sum;
        //   K还剩，负数全部转正，k还剩偶数个则返回sum, k还剩奇数个，则减去2倍的最小正数。
        return sum - (k % 2 == 0 ? 0 : 2 * min);
    }
}
