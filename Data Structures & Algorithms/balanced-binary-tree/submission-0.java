/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        return solve(root).isBalanced;
    }

    private Pair solve(TreeNode root) {
        if (root == null) {
            return new Pair(0, true);
        }
        Pair left = solve(root.left);
        Pair right = solve(root.right);
        int height = 1 + Math.max(left.height, right.height);
        boolean isBalanced =
                left.isBalanced &&
                right.isBalanced &&
                Math.abs(left.height - right.height) <= 1;
        return new Pair(height, isBalanced);
    }
}

class Pair {
    int height;
    boolean isBalanced;
    Pair(int height, boolean isBalanced) {
        this.height = height;
        this.isBalanced = isBalanced;
    }
}   
