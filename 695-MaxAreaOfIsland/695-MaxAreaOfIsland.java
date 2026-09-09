// Last updated: 09/09/2026, 16:26:40
class Solution {
    int maxarea=0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int area=dfs(grid,i,j);
                    maxarea=Math.max(area,maxarea);
                }
            }
        }
        return maxarea;
    }

    private int dfs(int[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;

        return 1+ dfs(grid,i+1,j)+dfs(grid,i-1,j)+dfs(grid,i,j+1)+dfs(grid,i,j-1);
    }
}