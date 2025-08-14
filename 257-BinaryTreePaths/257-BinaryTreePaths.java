// Last updated: 14/08/2025, 11:33:51
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
/*class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        
    }
}*/
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            dfs(root, "", paths);
        }
        return paths;
    }
    
    private void dfs(TreeNode node, String path, List<String> paths) {
        if (node.left == null && node.right == null) {
            // If it's a leaf, add the path to the list
            paths.add(path + node.val);
        } else {
            // If it's not a leaf, append current node to path and go deeper
            path += node.val + "->";
            if (node.left != null) {
                dfs(node.left, path, paths);
            }
            if (node.right != null) {
                dfs(node.right, path, paths);
            }
        }
    }
}
