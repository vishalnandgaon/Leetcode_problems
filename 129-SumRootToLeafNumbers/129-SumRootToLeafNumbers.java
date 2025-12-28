// Last updated: 28/12/2025, 21:27:16
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
    public int sumNumbers(TreeNode root) {
        return solve(root,0);
    }

    public int solve(TreeNode root,int sum){
        if(root==null) return 0;

        if(root.right==null && root.left==null){
            return sum*10+root.val;
        }
        int l=solve(root.left,sum*10+root.val);
        int r=solve(root.right,sum*10+root.val);

        return l+r;
    }
}