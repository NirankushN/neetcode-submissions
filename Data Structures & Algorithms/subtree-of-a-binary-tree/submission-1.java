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
    
    public String inOrderT(TreeNode root,String s){
        if(root==null){
            return "*";
        }
        return  Integer.valueOf(root.val).toString() + inOrderT(root.left,s)+ inOrderT(root.right,s);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String s="";
        String subs="";
        s=inOrderT( root, s);
        subs=inOrderT( subRoot, subs);
        // System.out.println(s);
        // System.out.println(subs);
        return s.contains(subs);
    }
}
