// Last updated: 12/01/2026, 22:48:34
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
    class Pair{
        int d;
        TreeNode n;
        Pair(int d,TreeNode n){
            this.d=d;
            this.n=n;
        }
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return dfs(root).n;
    }

    private Pair dfs(TreeNode root){
        if(root==null) return new Pair(0,null);

        Pair left=dfs(root.left);
        Pair right=dfs(root.right);

        if(left.d>right.d){
            return new Pair(left.d+1,left.n);
        }

        if(right.d>left.d){
            return new Pair(right.d+1,right.n);
        }

        else{
            return new Pair(left.d+1,root);
        }
    }
}