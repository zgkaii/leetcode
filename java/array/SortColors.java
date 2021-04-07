package array;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/04/07 16:53
 * @Description: 75. 颜色分类 https://leetcode-cn.com/problems/sort-colors/
 */
public class SortColors {
    // Arrays.sort(nums); // 不是原地算法
    // 0红 1白 2蓝

    /**
     * 1.快速排序 时间复杂度O(n) 空间复杂度O(1)
     */
    public static void sortColors1(int[] nums) {
        int writeIndex = 0;
        final int pivot = 1; // Hardcoded pivot.
        int n = nums.length - 1;

        // Scan from left to right to find elements less than the pivot (1).
        // If found, swap with the writeIndex and increase writeIndex
        // to point to the next available location.
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < pivot) {
                swap(nums, i, writeIndex++);
            }
        }

        // zeroesEnd writeIndex
        // | |
        // Scan from right to zeroesEnd index. [ 0, 0, 0, 1, 2, 2, 1 ].
        // Try to find elements larger than the pivot, if found swap.
        // Place the writeIndex to the next available location.
        // Keep iterating until we reach the zeroesEnd.
        // We are sure that elements before zeroesEnd are already in their place.
        int zeroesEnd = writeIndex;
        writeIndex = n;
        for (int i = n; i >= zeroesEnd; --i) {
            if (nums[i] > pivot) {
                swap(nums, i, writeIndex--);
            }
        }
    }

    /**
     * 交换元素
     */
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /**
     * 双指针法 时间复杂度O(n) 空间复杂度O(1)
     */
    public static void sortColors2(int[] nums) {
        // p0确定0边界，p1确定1边界
        int p0 = 0, p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            nums[i] = 2;
            // 1的边界右移
            if (num < 2)
                nums[p1++] = 1;
            // 0的边界右移
            if (num < 1)
                nums[p0++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 0, 2, 1, 1, 0 };
        SortColors.sortColors1(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
