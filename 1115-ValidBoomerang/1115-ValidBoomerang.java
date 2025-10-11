// Last updated: 11/10/2025, 23:34:59
class Solution {
    public boolean isBoomerang(int[][] points) {
        double area=(double) 0.5*(points[0][0]*(points[1][1]-points[2][1]) + points[1][0]*(points[2][1]-points[0][1]) + points[2][0] *(points[0][1]-points[1][1]));

        if(area==0) return false;
        return true;
    }
}