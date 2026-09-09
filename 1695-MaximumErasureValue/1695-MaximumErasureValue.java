// Last updated: 09/09/2026, 16:15:39
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        int start =0;
        int maxsum=0;
        int currsum=0;
        HashSet<Integer> set=new HashSet<>();
        for(int end=0;end<n;end++){
            while(set.contains(nums[end])){
                set.remove(nums[start]);
                currsum-=nums[start];
                start++;
            }
            
            set.add(nums[end]);
            currsum+=nums[end];
            maxsum=Math.max(maxsum,currsum);
        }
        return maxsum;
    }
}