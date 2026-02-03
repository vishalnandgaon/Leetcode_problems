// Last updated: 03/02/2026, 23:48:49
class Solution {
    public int minimizeTheDifference(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] dp = new int[n][5000];
        for(int i=0; i<m; i++){
            dp[0][mat[0][i]] = 1;
        }

        for(int i=1; i<n; i++){
            for(int s=0; s<5000; s++){
                for(int j=0; j<m; j++){
                if(s >= mat[i][j] && dp[i][s] == 0){
                    dp[i][s] = dp[i-1][s-mat[i][j]];
                }
            }
            }
           
        }
         int min = Integer.MAX_VALUE;
         if(dp[n-1][target] == 1) return 0;
        for(int i=0; i<5000; i++){
            if(dp[n-1][i] == 1)
            min = Math.min(min, (int)Math.abs(target - i));
        }

        return min;
    }
}