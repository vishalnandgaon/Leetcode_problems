// Last updated: 03/04/2026, 15:56:50
1class Solution {
2    public boolean canPartition(int[] nums) {
3        int sum=0;
4        for(int i=0;i<nums.length;i++){
5            sum+=nums[i];
6        }
7        if(sum%2!=0) return false;
8        int target=sum/2;
9        boolean[] dp=new boolean[(sum/2)+1];
10        dp[0]=true;
11
12        for(int num:nums){
13            for(int j=target;j>=num;j--){
14                dp[j]=dp[j] || dp[j-num];
15            }
16        }
17
18        return dp[dp.length-1];
19    }
20}