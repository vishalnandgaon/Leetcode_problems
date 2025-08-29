// Last updated: 29/08/2025, 22:06:18
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double diagonals=Integer.MIN_VALUE;
        int area=0;
        for(int i=0;i<dimensions.length;i++){
            double diagonal=Math.sqrt(dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1]);
            if(diagonal>diagonals){
                area=dimensions[i][0]*dimensions[i][1];
                diagonals=diagonal;
            }
            if(diagonal==diagonals){
                int newarea=dimensions[i][0]*dimensions[i][1];
                area=Math.max(area,newarea);
            }

        }
        return area;
    }
}