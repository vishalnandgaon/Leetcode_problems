// Last updated: 09/09/2026, 16:23:37
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);
    }
    private int atMost(int[] nums,int goal){
        if(goal<0)return 0;
        int sum=0;
        int start=0;
        int n=nums.length;
        int count=0;
        for(int end=0;end<n;end++){
            sum+=nums[end];
            while(sum>goal){
                sum-=nums[start];
                start++;
            }
            count+=end-start+1;
        }
        return count;
    }
}