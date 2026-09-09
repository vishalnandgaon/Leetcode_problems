// Last updated: 09/09/2026, 16:04:27
class Solution {
    public int minimumArea(int[][] grid) {
        int mincol=grid[0].length;
        int maxcol=-1;
        int minrow=grid.length;
        int maxrow=-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    mincol=Math.min(mincol,j);
                    maxcol=Math.max(maxcol,j);
                    minrow=Math.min(minrow,i);
                    maxrow=Math.max(maxrow,i);   
                }
            }
        }

        int height=maxrow-minrow+1;
        int width=maxcol-mincol+1;
        int area =height*width;
        return area;
    }
}