// Last updated: 14/08/2025, 11:33:27
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode updated=new ListNode(100);
        ListNode newhead=updated;
        ListNode temp=head.next;
        ListNode tempo=head.next;
        while(temp!=null){
            int sum=0;
            while(tempo.val!=0){
                sum=sum+tempo.val;
                tempo=tempo.next;               
            }
            ListNode a=new ListNode(sum);
            updated.next=a;
            updated=a;
            tempo=tempo.next;
            temp=tempo;
        }
        return newhead.next;
    }
}