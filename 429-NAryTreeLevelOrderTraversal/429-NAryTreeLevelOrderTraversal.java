// Last updated: 09/09/2026, 16:25:47
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list=new ArrayList<>();
        solve(list,root);
        return list;
    }

    private void solve(List<List<Integer>> list,Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> ls=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                Node temp=q.poll();
                ls.add(temp.val);
                for(Node child:temp.children){
                    q.add(child);
                }
            }
            list.add(ls);
        }
    }
}