// Last updated: 09/09/2026, 16:34:03
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        HashMap<Node,Node> map=new HashMap<>();

        Node temp=head;

        while(temp!=null){
            map.put(temp,new Node(temp.val));
            temp=temp.next;
        }

        temp=head;
        Node copyh=map.get(temp);
        while(temp!=null){
            Node copy=map.get(temp);
            copy.next=map.get(temp.next);
            copy.random=map.get(temp.random);
            copy=copy.next;
            temp=temp.next;
        }
        return copyh;
    }
}