// Last updated: 14/08/2025, 11:33:55
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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st= new Stack<>();
        ListNode dummy = head;
        while(dummy!=null){
            st.push(dummy.val);
            dummy=dummy.next;
        }
        while(head!=null){
            if(head.val==st.peek()){
                head=head.next;
                st.pop();
            }
            else{
                return false;
            }
        }
        return true;
    }
}