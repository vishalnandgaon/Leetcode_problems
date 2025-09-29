// Last updated: 29/09/2025, 22:51:24
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ans[] = new int[nums.length-k+1];
        int p=0;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i>=k-1){
                ans[p++]=nums[dq.peekFirst()];
            }
        }

        return ans; 
    }
}