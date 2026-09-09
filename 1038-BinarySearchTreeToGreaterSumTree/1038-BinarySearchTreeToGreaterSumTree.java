// Last updated: 09/09/2026, 16:21:54
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
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
            return solve(root);
    }

    private TreeNode solve(TreeNode root){
        if(root == null) return null;

        solve(root.right);

        root.val += sum;
        sum = root.val;

        solve(root.left);

        return root;
    }
}