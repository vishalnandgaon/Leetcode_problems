// Last updated: 09/09/2026, 15:57:52
class Solution {
    public int earliestTime(int[][] tasks) {
        int min=Integer.MAX_VALUE;
        int n=tasks.length;
        for(int i=0;i<n;i++){
            min=Math.min(min,(tasks[i][0] +tasks[i][1]));
        }
        return min;
    }
}