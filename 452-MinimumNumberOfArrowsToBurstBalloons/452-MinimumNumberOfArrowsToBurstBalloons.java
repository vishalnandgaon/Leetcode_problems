// Last updated: 27/09/2025, 22:28:44
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) ->
        Integer.compare(a[0],b[0] ));

        int count=0;
        int maxone=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]<=maxone){
                maxone=Math.min(maxone,points[i][1]);
                continue;
            }
            else{
                count++;
                maxone=points[i][1];
            }
        }
        count++;
        return count;
    }
}