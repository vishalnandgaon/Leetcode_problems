// Last updated: 09/09/2026, 16:19:09
class Solution {
    long maxP = 0, total = 0;
    long mod = 1000000007;

    public int maxProduct(TreeNode root) {
        total = totalsum(root);
        dfs(root);
        return (int)(maxP % mod);
    }

    public long totalsum(TreeNode root){
        if(root == null) return 0;
        return root.val + totalsum(root.left) + totalsum(root.right);
    }

    public long dfs(TreeNode root){
        if(root == null) return 0;

        long left = dfs(root.left);
        long right = dfs(root.right);

        long subtreesum = root.val + left + right;
        maxP = Math.max(maxP, subtreesum * (total - subtreesum));

        return subtreesum;
    }
}
