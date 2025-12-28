// Last updated: 28/12/2025, 21:27:25
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
    public boolean isSymmetric(TreeNode root) {
        boolean ans=solve(root,root);
        return ans;
    }

    public boolean solve(TreeNode l,TreeNode r){
        if(l==null && r==null){
            return true;
        }
        if(l==null || r==null){
            return false;
        }
        if(l.val !=r.val){
            return false;
        }
        boolean temp1=solve(l.left,r.right);
        boolean temp2=solve(l.right,r.left);

        return temp1 && temp2;
    }
}