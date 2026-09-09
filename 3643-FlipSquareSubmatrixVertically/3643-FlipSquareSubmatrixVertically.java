// Last updated: 09/09/2026, 15:58:52
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int toprow=x;
        int lastrow=x+k-1;
        while(toprow<lastrow){
            for(int i=y;i<y+k;i++){
                int temp=grid[toprow][i];
                grid[toprow][i]=grid[lastrow][i];
                grid[lastrow][i]=temp;
            }
            toprow++;
            lastrow--;
        }

        return grid;
    }
}