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
    public int inOrderT(TreeNode r){
        if(r==null){
            return 0;
        }else{
            int i=inOrderT(r.left)+1;
            int j=inOrderT(r.right)+1;
            if(j>i){
                return j;
            }
            return i;
        }
    }
    public int maxDepth(TreeNode root) {
        return inOrderT(root);
    }
}
