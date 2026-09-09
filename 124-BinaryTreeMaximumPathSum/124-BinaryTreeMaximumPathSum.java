// Last updated: 09/09/2026, 16:34:30
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
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        height(root);
        return maxsum;
    }

    private int height(TreeNode root){
        if(root==null) return 0;

        int left=Math.max(height(root.left),0);
        int right=Math.max(height(root.right),0);

        maxsum=Math.max(left+right+root.val,maxsum);
        return Math.max(left,right)+root.val;
    }


}