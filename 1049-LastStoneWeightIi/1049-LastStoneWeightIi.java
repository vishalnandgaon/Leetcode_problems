// Last updated: 09/09/2026, 16:21:41
class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n=stones.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=stones[i];
        }
        int[][] dp=new int[n][sum+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }

        return solve(stones,0,0,sum,dp);
    }
    private int solve(int[] arr,int i,int curr,int sum,int[][]dp){
            if(i==arr.length){
                return Math.abs(sum-2*curr);
            }

            if(dp[i][curr]!=-1){
                return dp[i][curr];
            }

            int notake=solve(arr,i+1,curr,sum,dp);
            int take=solve(arr,i+1,curr+arr[i],sum,dp);

            return dp[i][curr]=Math.min(notake,take);
        }
}