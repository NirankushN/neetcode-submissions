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

    public void preOrdT(TreeNode root, List<Integer> res){
        if(root==null){
            return;
        }
        res.add(root.val);
        preOrdT(root.left,res);
        preOrdT(root.right,res);
        return;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> li=new ArrayList<Integer>();
        preOrdT(root,li);
        return li;
    }
}