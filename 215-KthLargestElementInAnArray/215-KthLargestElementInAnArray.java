// Last updated: 29/09/2025, 22:51:30
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        for(int num:nums){
            minheap.add(num);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        return minheap.peek();
    }
}