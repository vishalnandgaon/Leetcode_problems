// Last updated: 09/09/2026, 16:33:41
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public ListNode insertionSortList(ListNode head) {

        // Dummy node for sorted list
        ListNode dummy = new ListNode(0);

        ListNode curr = head;

        while (curr != null) {

            // Save next node
            ListNode nextNode = curr.next;

            // Find correct position in sorted list
            ListNode prev = dummy;

            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            // Insert current node
            curr.next = prev.next;
            prev.next = curr;

            // Move to next node
            curr = nextNode;
        }

        return dummy.next;
    }
    
}