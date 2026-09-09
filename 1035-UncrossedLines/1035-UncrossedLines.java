// Last updated: 09/09/2026, 16:22:00
class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[][] dp=new int[n+1][m+1];

        solve(nums1,nums2,dp);
        return dp[n][m];
    }

    private void solve(int[] arr1,int[] arr2,int[][] dp){
        for(int i=1;i<=arr1.length;i++){
            for(int j=1;j<=arr2.length;j++){
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    int a=dp[i-1][j];
                    int b=dp[i][j-1];
                    dp[i][j]=Math.max(a,b);
                }
            }
        }
    }
}