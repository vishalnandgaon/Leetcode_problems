// Last updated: 14/08/2025, 11:35:44
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode(0);
        ListNode head=dummy;
        int carry=0;
        
        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            int current = sum%10;
            ListNode a= new ListNode(current);
            head.next=a;
            head=head.next;
            carry= sum/10;


        }
        return dummy.next;
   }
}