// Last updated: 23/09/2025, 18:13:36
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int tank=0;
        int total=0;
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            total=total+diff;
            tank+=diff;

            if(tank<0){
                start=i+1;
                tank=0;
            }
        }
        return total>=0 ? start:-1;
    }
}