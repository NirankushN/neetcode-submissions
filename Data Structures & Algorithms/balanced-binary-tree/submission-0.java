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
    public int checkBalance(TreeNode r) {
    if (r == null) {
        return 0;
    }

    int leftHeight = checkBalance(r.left);
    // If left subtree is already unbalanced, pass -1 up
    if (leftHeight == -1) return -1;

    int rightHeight = checkBalance(r.right);
    // If right subtree is already unbalanced, pass -1 up
    if (rightHeight == -1) return -1;

    // The Core Fix: Check the balance condition here!
    if (Math.abs(leftHeight - rightHeight) > 1) {
        return -1; // Use -1 as a flag for "Unbalanced"
    }

    // Otherwise, return the height like you were doing
    return Math.max(leftHeight, rightHeight) + 1;
}
    public boolean isBalanced(TreeNode root) {
        int v=checkBalance(root);
        return v!=-1?true:false;
    }
}
