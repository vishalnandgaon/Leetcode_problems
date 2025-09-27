// Last updated: 27/09/2025, 22:28:31
class Solution {
    private double areaOfTriangle(int[] a,int[] b,int[] c){
        return 0.5*Math.abs((a[0]*(b[1]-c[1]) + b[0]*(c[1]-a[1]) +c[0]*(a[1]-b[1])));
    }
    public double largestTriangleArea(int[][] points) {
        double maxarea=0;
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                for(int k=j+1;k<points.length;k++){
                    maxarea=Math.max(maxarea,areaOfTriangle(points[i],points[j],points[k]));
                }
            }
        }
        return maxarea;
    }
}