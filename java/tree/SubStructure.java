package tree;

public class SubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null)
            return false;
        return check(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    public boolean check(TreeNode A, TreeNode B) {
        // 当节点 B 为空：说明树 B 已匹配完成（越过叶子节点），因此返回 true
        // 当节点 A 为空：说明已经越过树 A 叶子节点，即匹配失败，返回 false
        // 当节点 A 和 B 的值不同：说明匹配失败，返回 false
        if (B == null)
            return true;
        if (A == null || A.val != B.val)
            return false;
        return check(A.left, B.left) && check(A.right, B.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
