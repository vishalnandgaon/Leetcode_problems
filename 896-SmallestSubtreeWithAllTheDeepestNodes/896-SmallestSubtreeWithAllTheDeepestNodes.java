// Last updated: 12/01/2026, 22:49:16
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
        int dist;
        TreeNode node;
        Pair(int dist,TreeNode node){
            this.dist=dist;
            this.node=node;
        }
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
       return dfs(root).node;
    }

    private Pair dfs(TreeNode root){
        if(root==null) return new Pair(0,null);

        Pair left=dfs(root.left);
        Pair right=dfs(root.right);

        if(left.dist>right.dist){
            return new Pair(left.dist+1,left.node);
        }
        else if(right.dist>left.dist){
            return new Pair(right.dist+1,right.node);
        }
        else{
            return new Pair(left.dist+1,root);
        }
    }
}