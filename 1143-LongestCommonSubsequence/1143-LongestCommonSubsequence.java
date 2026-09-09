// Last updated: 09/09/2026, 16:20:52
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(text1,text2,0,0,dp);
    }
    private int solve(String a,String b,int i,int j,int[][] dp){
        if(i==a.length() || j==b.length())return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int sum=0;
        if(a.charAt(i)==b.charAt(j)){
            sum=1+solve(a,b,i+1,j+1,dp);
        }
        else{
            int left=solve(a,b,i+1,j,dp);
            int right=solve(a,b,i,j+1,dp);
            sum=Math.max(left,right);
        }
        return dp[i][j]=sum;
    }

}