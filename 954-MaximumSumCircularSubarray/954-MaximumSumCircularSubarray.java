// Last updated: 26/09/2025, 15:38:30
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum=0;
        int currmax=0;
        int maxsum=nums[0];
        int minsum=nums[0];
        int currmin=0;
        for(int num: nums){
            currmax=Math.max(num,currmax+num);
            maxsum=Math.max(maxsum,currmax);


            currmin=Math.min(num,currmin+num);
            minsum=Math.min(currmin,minsum);

            totalsum+=num;
        }
        if(maxsum<0){
            return maxsum;
        }
        return Math.max(maxsum,totalsum-minsum);
    }
}