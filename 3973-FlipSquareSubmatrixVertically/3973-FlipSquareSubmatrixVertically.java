// Last updated: 14/08/2025, 11:33:29
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int toprow=x;
        int lastrow=x+k-1;
        while(toprow<lastrow){
            for(int col=y;col<y+k;col++){
                int temp=grid[toprow][col];
                grid[toprow][col]=grid[lastrow][col];
                grid[lastrow][col]=temp;
            }
            toprow++;
            lastrow--;
        }
        return grid;
    }
}