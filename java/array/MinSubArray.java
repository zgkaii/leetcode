package array;

/**
 * 209. 长度最小的子数组 https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 */
public class MinSubArray {
    // 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组，并返回其长度。
    // 输入：target=7 nums=[2,3,1,2,4,3] 输出：2 子数组[4,3]是该条件下的长度最小的子数组。

    /**
     * 方法一：滑动窗口 O(n)
     */
    public int minSubArrayLen1(int target, int[] nums) {
        int left = 0, sum = 0, result = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    /**
     * 方法二：前缀和 + 二分查找 O(nlogn)
     */
    public int minSubArrayLen2(int target, int[] nums) {
        

        return 0;
    }
}
