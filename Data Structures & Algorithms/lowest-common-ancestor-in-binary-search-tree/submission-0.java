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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(p.val==q.val){
            return p;
        }
        int pval=p.val;
        int qval=q.val;
        int rval=root.val;
        if((rval>=pval && rval<=qval ) || (rval<=pval && rval>=qval )){
            return root;
        }else if(rval<pval && rval<qval){
            return lowestCommonAncestor(root.right, p, q);
        }else{
           return lowestCommonAncestor(root.left, p, q);
        }

    }
}
