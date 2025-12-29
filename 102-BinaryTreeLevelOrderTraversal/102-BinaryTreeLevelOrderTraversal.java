// Last updated: 29/12/2025, 12:32:39
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
    List<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> ls=new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode tp=q.remove();
                ls.add(tp.val);

                if(tp.left!=null) q.add(tp.left);
                if(tp.right!=null) q.add(tp.right);
            }

            list.add(ls);
        }

        return list;
    }
}