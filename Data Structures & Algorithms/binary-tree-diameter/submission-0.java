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
    public int diameterOfBinaryTree(TreeNode root) {
        return solve(root).diameter;
    }

    private Pair solve(TreeNode root) {
        if (root == null) {
            return new Pair(0, 0);
        }

        Pair left = solve(root.left);
        Pair right = solve(root.right);

        int height = 1 + Math.max(left.height, right.height);

        int throughRoot = left.height + right.height;

        int diameter = Math.max(
                throughRoot,
                Math.max(left.diameter, right.diameter)
        );

        return new Pair(height, diameter);
    }
}

class Pair {
    int height;
    int diameter;

    Pair(int height, int diameter) {
        this.height = height;
        this.diameter = diameter;
    }
}
