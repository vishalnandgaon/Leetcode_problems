// Last updated: 04/11/2025, 21:39:08
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set =new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode iterator=dummy;
        while( iterator !=null &&  iterator.next !=null ){
            if(set.contains(iterator.next.val)){
                iterator.next=iterator.next.next;
            }
            else{
                iterator=iterator.next;
            }
        }
        return dummy.next;
    }
}