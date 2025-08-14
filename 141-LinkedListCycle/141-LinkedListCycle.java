// Last updated: 14/08/2025, 11:34:15
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null){
            slow=slow.next;
            if(fast.next==null){
                return false;
            }
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}