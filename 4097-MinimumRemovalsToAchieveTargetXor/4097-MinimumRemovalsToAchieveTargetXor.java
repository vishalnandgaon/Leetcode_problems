// Last updated: 22/03/2026, 21:06:43
class Solution {
    public int minRemovals(int[] nums, int target) {
        int n=nums.length;
        int totalXOR=16384;
        int[] maxKept=new int[totalXOR];
        Arrays.fill(maxKept,-1);
        maxKept[0]=0;
        for(int num:nums){
            int[] nextMaxKept=maxKept.clone();
            for(int v=0;v<totalXOR;v++){
                if(maxKept[v]!=-1){
                    int nextV=v^num;
                    nextMaxKept[nextV]=Math.max(nextMaxKept[nextV],maxKept[v]+1);
                }
            }
            maxKept=nextMaxKept;
        }
        if(target<totalXOR && maxKept[target]!=-1){
            return n-maxKept[target];
        }
        return -1;
    }
}