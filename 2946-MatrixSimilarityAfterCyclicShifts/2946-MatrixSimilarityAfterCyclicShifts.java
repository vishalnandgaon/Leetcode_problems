// Last updated: 09/09/2026, 16:06:33
class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length, n=mat[0].length;
        k=k%n;
        if(k==0) return true;
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    arr[i][j]=mat[i][(j+k)%n];
                }
            }
            else{
                for(int j=0;j<n;j++){
                    arr[i][(j+k)%n]=mat[i][j];
                }
            }
        }

        return Arrays.deepEquals(arr,mat);
    }
}