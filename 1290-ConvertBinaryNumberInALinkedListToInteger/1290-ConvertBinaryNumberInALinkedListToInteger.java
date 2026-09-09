// Last updated: 09/09/2026, 16:19:47
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
    public int getDecimalValue(ListNode head) {
        int size=0;
        ListNode temp= head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        int sum=0;
        int power=size-1;
        temp=head;
        while(temp!=null){
            if(temp.val==1){
                sum+=Math.pow(2,power);

            }
            temp=temp.next;
            power--;
        }
        return sum;
    }
}