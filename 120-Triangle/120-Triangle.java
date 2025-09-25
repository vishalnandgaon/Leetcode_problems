// Last updated: 25/09/2025, 12:27:38
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        for(int row=n-2;row>=0;row--){
            for(int col=0;col<=row;col++){
                int down=triangle.get(row+1).get(col);
                int diag=triangle.get(row+1).get(col+1);
                int updated=triangle.get(row).get(col) + Math.min(down,diag);
                triangle.get(row).set(col,updated);
            }
        }
        return triangle.get(0).get(0);
    }
}