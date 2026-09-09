// Last updated: 09/09/2026, 16:21:52
class Solution {
    public boolean isBoomerang(int[][] points) {
        double area=(double) 0.5*(points[0][0]*(points[1][1]-points[2][1]) + points[1][0]*(points[2][1]-points[0][1]) + points[2][0] *(points[0][1]-points[1][1]));

        if(area==0) return false;
        return true;
    }
}