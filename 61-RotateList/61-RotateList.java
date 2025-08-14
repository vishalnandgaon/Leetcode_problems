// Last updated: 14/08/2025, 11:34:35
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Edge case: if the list is empty or has only one node
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Find the length of the list and the last node
        ListNode oldTail = head;
        int length = 1;
        while (oldTail.next != null) {
            oldTail = oldTail.next;
            length++;
        }

        // Step 2: Adjust k to avoid unnecessary rotations
        k = k % length;
        if (k == 0) {
            return head;
        }

        // Step 3: Make the list circular by connecting the last node to the head
        oldTail.next = head;

        // Step 4: Find the new tail (the node before the new head)
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        // Step 5: The new head is the node after the new tail
        ListNode newHead = newTail.next;

        // Step 6: Break the circular link to complete the rotation
        newTail.next = null;

        return newHead;
    }
}
