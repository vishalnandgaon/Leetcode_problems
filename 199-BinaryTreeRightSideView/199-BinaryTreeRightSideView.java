// Last updated: 28/12/2025, 21:26:44
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
    int maxd=0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        rsv(root,1,list);
        return list;
    }
    public void rsv(TreeNode root,int curr,List<Integer> list){
        if(root==null) return;

        if(maxd<curr){
            list.add(root.val);
            maxd=curr;
        }

        rsv(root.right,curr+1,list);
        rsv(root.left,curr+1,list);

    }
}