// Last updated: 09/09/2026, 16:29:21
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(set);

        if(pq.size()<3) return pq.peek();
        pq.poll();
        pq.poll();
        return pq.poll();
    }
}