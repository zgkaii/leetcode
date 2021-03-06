package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/01/28 21:46
 * @Description: 77. 组合 https://leetcode-cn.com/problems/combinations/
 *               <p>
 *               给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 **/
public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combs = new ArrayList<List<Integer>>();
        combine(combs, new ArrayList<Integer>(), 1, n, k);
        return combs;
    }

    public static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
        if (k == 0) {
            combs.add(new ArrayList<Integer>(comb));
            return;
        }
        for (int i = start; i <= n; i++) {
            comb.add(i);
            combine(combs, comb, i + 1, n, k - 1);
            comb.remove(comb.size() - 1);
        }
    }
}
