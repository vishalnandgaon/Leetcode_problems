// Last updated: 09/09/2026, 16:05:01
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n=energy.length;
        int ans=Integer.MIN_VALUE;
        for(int start=n-1;start>=n-k;start--){
            int sum=0;
            for(int j=start;j>=0;j-=k){
                sum+=energy[j];
                ans=Math.max(sum,ans);
            }
        }
        return ans;
    }
}