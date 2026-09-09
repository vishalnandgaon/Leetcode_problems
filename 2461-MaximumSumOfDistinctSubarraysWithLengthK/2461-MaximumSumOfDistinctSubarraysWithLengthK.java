// Last updated: 09/09/2026, 16:08:49
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        long currsum=0;
        long maxsum=0;
        int start=0;
        for(int end=0;end<n;end++){
            while(set.contains(nums[end])){
                currsum-=nums[start];
                set.remove(nums[start]);
                start++;
            }
            set.add(nums[end]);
            currsum+=nums[end];
            if(end-start+1==k){
                maxsum=Math.max(maxsum,currsum);
                set.remove(nums[start]);
                currsum-=nums[start];
                start++;
            }
        }
        return maxsum;
    }
}