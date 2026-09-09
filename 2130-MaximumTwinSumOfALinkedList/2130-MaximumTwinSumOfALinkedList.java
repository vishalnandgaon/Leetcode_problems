// Last updated: 09/09/2026, 16:11:25
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second half
        ListNode second = reverse(slow);

        // compare first half and reversed second half
        ListNode first = head;
        int max = 0;

        while (second != null) {
            int sum = first.val + second.val;
            max = Math.max(max, sum);

            first = first.next;
            second = second.next;
        }

        return max;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}