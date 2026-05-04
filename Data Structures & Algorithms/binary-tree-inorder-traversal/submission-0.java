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
    public void inOrdT(TreeNode root, List<Integer> res){
        if(root==null){
            return;
        }
        inOrdT(root.left,res);
        res.add(root.val);
        inOrdT(root.right,res);

        return;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nl=new ArrayList<Integer>();
        inOrdT(root,nl);
        return nl;
    }
}