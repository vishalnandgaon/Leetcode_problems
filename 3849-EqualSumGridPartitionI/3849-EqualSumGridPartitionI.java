// Last updated: 25/03/2026, 22:09:19
class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        long[][] pre = new long[n][m];

        // build prefix sum
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                pre[i][j] = grid[i][j];

                if(j > 0) pre[i][j] += pre[i][j - 1];
                if(i > 0) pre[i][j] += pre[i - 1][j];
                if(i > 0 && j > 0) pre[i][j] -= pre[i - 1][j - 1];
            }
        }

        long total = pre[n - 1][m - 1];

        // horizontal split
        for(int i = 0; i < n - 1; i++){
            if(pre[i][m - 1] * 2 == total){
                return true;
            }
        }

        // vertical split
        for(int j = 0; j < m - 1; j++){
            if(pre[n - 1][j] * 2 == total){
                return true;
            }
        }

        return false;
    }
}