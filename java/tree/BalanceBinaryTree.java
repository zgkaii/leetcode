package tree;

/**
 * https://leetcode-cn.com/problems/balanced-binary-tree/ 平衡二叉树
 */
public class BalanceBinaryTree {
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return isBST(root).isB;
        }

        private ReturnNode isBST(TreeNode root) {
            if (root == null) {
                return new ReturnNode(0, true);
            }
            // 不平衡的情况有3种：左树不平衡、右树不平衡、左树和右树差的绝对值大于1
            ReturnNode left = isBST(root.left);
            ReturnNode right = isBST(root.right);
            if (left.isB == false || right.isB == false) {
                return new ReturnNode(0, false);
            }

            if (Math.abs(left.depth - right.depth) > 1) {
                return new ReturnNode(0, false);
            }
            // 不满足上面3种情况，说明平衡了，树的深度为左右俩子树最大深度+1
            return new ReturnNode(Math.max(left.depth, right.depth) + 1, true);
        }

        public class ReturnNode {
            boolean isB;
            int depth;

            public ReturnNode(int depth, boolean isB) {
                this.isB = isB;
                this.depth = depth;
            }
        }
    }

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}