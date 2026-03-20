// Last updated: 20/03/2026, 21:06:45
class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] countX=new int[n][m];
        int[][] gridd=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='X'){
                    gridd[i][j]=1;
                    countX[i][j]=1;
                }
                else if(grid[i][j]=='Y'){
                    gridd[i][j]=-1;
                }
                else{
                    gridd[i][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                gridd[i][j]+=gridd[i][j-1];
                countX[i][j]+=countX[i][j-1];
            }
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                gridd[i][j]+=gridd[i-1][j];
                countX[i][j]+=countX[i-1][j];
            }
        }

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(gridd[i][j]==0 && countX[i][j]>0){
                    count++;
                }
            }
        }
        return count;
    }
}