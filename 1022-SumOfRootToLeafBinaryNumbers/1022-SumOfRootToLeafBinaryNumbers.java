// Last updated: 09/09/2026, 16:22:09
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
    int total=0;
    public int sumRootToLeaf(TreeNode root) {
        solve(root,0);
        return total;
    }
    private void solve(TreeNode root,int curr){
        if(root==null){
            return;
        }

        curr=curr*2+root.val;
        if(root.left==null && root.right==null){
            total+=curr;
            return;
        }
        solve(root.left,curr);
        solve(root.right,curr);
    }
}