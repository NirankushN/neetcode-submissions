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

    public int maxDiameter = 0;
    public int intOrderT(TreeNode root,int mx){
        if(root==null){
            return 0;
        }
        int l=intOrderT(root.left,mx);
        int r= intOrderT(root.right,mx);
        //System.out.println("root.val = "+ root.val + " l = "+ l +" r = " + r );
        mx=Math.max(l,r);
        maxDiameter = Math.max(l+r,maxDiameter);
        return mx+1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int mx=intOrderT(root,0);
        //System.out.println(maxDiameter);
        return maxDiameter;
    }
}
