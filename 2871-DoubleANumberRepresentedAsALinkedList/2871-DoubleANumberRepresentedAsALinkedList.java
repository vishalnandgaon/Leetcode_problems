// Last updated: 02/02/2026, 22:09:59
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
    public ListNode doubleIt(ListNode head) {
        ListNode reversed=reverse(head);
        int carry=0;
        ListNode temp=reversed;
        while(temp!=null){
            temp.val=temp.val*2+carry;
            carry=temp.val/10;
            temp.val%=10;
            temp=temp.next;
        }
        ListNode rev=reverse(reversed);
        if(carry==1){
            ListNode dummy=new ListNode(1);
            dummy.next=rev;
            rev=dummy;
        }
        return rev;
    }

    private ListNode reverse(ListNode head){
        ListNode prev=null,curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}