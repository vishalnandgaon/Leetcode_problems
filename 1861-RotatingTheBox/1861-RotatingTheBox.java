// Last updated: 09/09/2026, 16:14:10
class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n=boxGrid.length;
        int m=boxGrid[0].length;

        for(int i=0;i<n;i++){
            int empty=m-1;
            for(int j=m-1;j>=0;j--){
                if(boxGrid[i][j]=='*'){
                    empty=j-1;
                }
                else if(boxGrid[i][j]=='#'){
                    char temp=boxGrid[i][empty];
                    boxGrid[i][empty]='#';
                    boxGrid[i][j]=temp;
                    empty--;
                }
            }
        }

        char[][] grid=new char[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[j][n-1-i]=boxGrid[i][j];
            }
        }
        return grid;
    }
}