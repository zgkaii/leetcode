package dfs_bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/combination-sum/
 * 回溯（dfs实现） + 剪枝
 */
public class CombinationSum {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] arr, int target) {
        // 1. 排序 arr[0] > target --> return []
        Arrays.sort(arr);
        if (arr == null || arr.length == 0 || arr[0] > target) {
            return res;
        }

        // 2. 深度优先遍历
        dfs(arr, 0, arr.length - 1, target);
        return res;
    }

    private void dfs(int[] arr, int start, int end, int target) {
        // 递归终止条件
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i <= end; i++) {
            // 3.剪枝
            if (target - arr[i] < 0) {
                break;
            }

            path.add(arr[i]);
            // 深入下一层，元素可重复，start依然是i
            dfs(arr, i, end, target - arr[i]);
            path.remove(path.size() - 1);
        }
    }
}
