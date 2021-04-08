package divde_conquer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/01/29 13:54
 * @Description: 78. 子集 https://leetcode-cn.com/problems/subsets/
 */
public class Subsets {

    // https://leetcode.com/problems/subsets/discuss/27281/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning)
    List<Integer> tmp = new ArrayList<>();
    ArrayList<List<Integer>> ans = new ArrayList<>();

    /**
     * 位运算
     */
    public List<List<Integer>> subsets1(int[] nums) {
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); mask++) {
            tmp.clear();
            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) != 0) {
                    tmp.add(nums[i]);
                }
            }
            ans.add(new ArrayList<Integer>());
        }
        return ans;
    }

    /**
     * 回溯法
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        // 深度优先搜索
        backtrack(nums, new ArrayList<Integer>(), ans, 0);
        return ans;
    }

    public void backtrack(int[] nums, List<Integer> tmp, List<List<Integer>> ans, int start) {
        if (nums.length == start) {
            // 当前位的tmp子集直接加入ans中，一开始为空集
            ans.add(new ArrayList<>(tmp));
            return;
        }
        tmp.add(nums[start]);
        backtrack(nums, tmp, ans, start + 1);
        // 取消当前位的选择，下一轮循环重新选择一次当前位
        tmp.remove(tmp.size() - 1);
        backtrack(nums, tmp, ans, start + 1);
    }
}
