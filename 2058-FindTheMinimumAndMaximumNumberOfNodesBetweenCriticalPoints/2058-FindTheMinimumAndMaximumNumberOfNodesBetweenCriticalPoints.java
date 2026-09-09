// Last updated: 09/09/2026, 16:12:04
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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode curr=head;
        ListNode prev=new ListNode(head.val);
        ListNode next=head.next;
        int count=0;
        while(next!=null){
            if(curr.val<prev.val && curr.val<next.val){
                list.add(count);
            }
            else if(curr.val>prev.val && curr.val>next.val){
                list.add(count);
            }
            count++;
            prev=curr;
            curr=next;
            next=next.next;
        }
        if(list.size()<2) return new int[]{-1,-1};
        int max=list.get(list.size()-1)-list.get(0);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            min=Math.min(list.get(i)-list.get(i-1),min);
        }
        return new int[]{min,max};
    }
}