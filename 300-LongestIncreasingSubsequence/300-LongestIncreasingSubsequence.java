// Last updated: 08/01/2026, 22:50:44
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);

        for(int i=1;i<nums.length;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    int l=dp[j];
                    dp[i]=Math.max(dp[i],l+1);
                }
            }
        }
        int max=dp[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}