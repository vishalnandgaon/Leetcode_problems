// Last updated: 22/08/2025, 11:47:57
class Solution {
    public int minimumArea(int[][] grid) {
        int minRow=grid.length;
        int minCol=grid[0].length;
        int maxRow=-1;
        int maxCol=-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    minRow=Math.min(i,minRow);
                    maxRow=Math.max(maxRow,i);
                    minCol=Math.min(j,minCol);
                    maxCol=Math.max(j,maxCol);
                }
            }
        }
        int height=maxCol-minCol+1;
        int width=maxRow-minRow+1;
        int area= height*width;
        return area;
    }
}