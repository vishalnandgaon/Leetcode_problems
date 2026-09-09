// Last updated: 09/09/2026, 16:35:10
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) {
            return true;
        }

        int f = max(root.left);
        int s = min(root.right);
        
        if((root.left == null ||f < root.val) && (root.right == null || root.val < s)) {
            boolean a = isValidBST(root.left);
            boolean b = isValidBST(root.right);

            return (a && b);
        }

        else {
            return false;
        }
    }


    public int max(TreeNode root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }

        int f = max(root.left);
        int s = max(root.right);

        return Math.max(Math.max(f, s), root.val);
    }


    public int min(TreeNode root) {
        if(root == null) {
            return Integer.MAX_VALUE;
        }

        int f = min(root.left);
        int s = min(root.right);

        return Math.min(Math.min(f, s), root.val);
    }
}