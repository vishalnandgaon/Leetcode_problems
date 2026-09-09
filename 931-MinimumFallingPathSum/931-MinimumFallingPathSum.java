// Last updated: 09/09/2026, 16:23:34
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int min=Integer.MAX_VALUE;
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-101);
        }
        for(int i=0;i<matrix[0].length;i++){
            min=Math.min(solve(0,i,matrix,dp),min);
        }

        return min;
    }

    private int solve(int i,int j,int[][] matrix,int[][] dp){
        if(j<0 || j>=matrix[0].length){
            return (int)1e9;
        }
        if(i==matrix.length-1){
            return matrix[i][j];
        }
        if(dp[i][j]!=-101){
            return dp[i][j];
        }
        int down=solve(i+1,j,matrix,dp);
        int left=solve(i+1,j-1,matrix,dp);
        int right=solve(i+1,j+1,matrix,dp);
        return dp[i][j]=matrix[i][j] + Math.min(down,Math.min(right,left));
    }  
}