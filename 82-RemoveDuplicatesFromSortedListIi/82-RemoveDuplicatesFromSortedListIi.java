// Last updated: 10/09/2025, 11:55:05
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
    public ListNode deleteDuplicates(ListNode head) {
        // Dummy node helps handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;  // Last node before current sequence
        ListNode current = head;
        
        while (current != null) {
            // Detect duplicates
            boolean isDuplicate = false;
            while (current.next != null && current.val == current.next.val) {
                isDuplicate = true;
                current = current.next;  // Skip duplicate nodes
            }
            
            if (isDuplicate) {
                // Skip all nodes with this duplicate value
                prev.next = current.next;
            } else {
                // No duplicates, move prev
                prev = current;
            }
            
            current = current.next;  // Move forward
        }
        
        return dummy.next;
    }
}
