// Last updated: 29/09/2025, 22:50:42
class Solution {
    public int countNegatives(int[][] grid) {
        int i=0;
        int count=0;
        while(i<grid.length){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    count=count+(grid[0].length-j);
                    break;
                }
            }
            i++;
        }
        return count;
    }
}