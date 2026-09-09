// Last updated: 09/09/2026, 16:22:06
class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->(a[0]-a[1])-(b[0]-b[1]));

        int count=0;
        for(int i=0;i<costs.length/2;i++){
            count+=costs[i][0];
        }
        for(int i=costs.length/2;i<costs.length;i++){
            count+=costs[i][1];
        }
        return count;
    }
}