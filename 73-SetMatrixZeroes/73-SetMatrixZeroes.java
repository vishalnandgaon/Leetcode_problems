// Last updated: 11/10/2025, 23:37:11
class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> set=new HashSet<>();
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    set.add(i);
                }
            }
        }
        Set<Integer> bet=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    bet.add(j);
                }
            }
        }

        for(int i=0;i<n;i++){
            if(set.contains(i)){
                for(int j=0;j<m;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(bet.contains(i)){
                for(int j=0;j<n;j++){
                    matrix[j][i]=0;
                }
            }
        }

    }
}