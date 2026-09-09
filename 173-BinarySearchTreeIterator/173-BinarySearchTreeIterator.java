// Last updated: 09/09/2026, 16:33:03
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
class BSTIterator {
    private PriorityQueue<Integer> pq=new PriorityQueue<>();
    public BSTIterator(TreeNode root) {
        add(root);
    }
    
    public int next() {
        int min=pq.poll();
        return min;
    }
    
    public boolean hasNext() {
        if(pq.size()==0) return false;
        return true;
    }
    private void add(TreeNode root){
        if(root==null) return;
        pq.add(root.val);
        add(root.left);
        add(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */