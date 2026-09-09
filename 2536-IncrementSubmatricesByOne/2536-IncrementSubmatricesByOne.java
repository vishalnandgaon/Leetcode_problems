// Last updated: 09/09/2026, 16:08:24
class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] diff=new int[n+1][n+1];
        for(int[] query:queries){
            int r1=query[0],c1=query[1],r2=query[2],c2=query[3];
            diff[r1][c1]++;
            diff[r1][c2+1]--;
            diff[r2+1][c1]--;
            diff[r2+1][c2+1]++;
        }

        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                diff[i][j]+=diff[i][j-1];
            }
        }
        for(int j=0;j<n;j++){
            for(int i=1;i<n;i++){
                diff[i][j]+=diff[i-1][j];
            }
        }
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=diff[i][j];
            }
        }
        return arr;
    }
}