package binarysearch;

/**
 * 704. 二分查找 https://leetcode-cn.com/problems/binary-search/
 */
public class BinarySearch {

    /**
     * 左闭右合
     */
    public int search1(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo >>> 1);
            if (nums[mid] < target)
                lo = mid + 1;
            else if (nums[mid] > target)
                hi = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    /**
     * 左闭右开
     */
    public int search2(int[] nums, int target) {
        int lo = 0, hi = nums.length;

        while (lo < hi) {
            int mid = lo + (hi - lo >>> 1);
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                lo = mid + 1;
            else if (nums[mid] > target)
                hi = mid;
        }
        return -1;
    }
}
