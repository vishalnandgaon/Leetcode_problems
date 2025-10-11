// Last updated: 11/10/2025, 23:34:56
class Solution {
    int max=0;
    public int getMaximumGold(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]>0){
                    solve(grid,i,j,0);
                }
            }
        }
        return max;
    }
    private void solve(int[][] grid,int i,int j,int curr){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0 ){
            return;
        }

        int stored=grid[i][j];
        curr+=stored;
        max=Math.max(curr,max);
        grid[i][j]=0;
        solve(grid,i+1,j,curr);
        solve(grid,i-1,j,curr);
        solve(grid,i,j+1,curr);
        solve(grid,i,j-1,curr);
        
        grid[i][j]=stored;

    }
}