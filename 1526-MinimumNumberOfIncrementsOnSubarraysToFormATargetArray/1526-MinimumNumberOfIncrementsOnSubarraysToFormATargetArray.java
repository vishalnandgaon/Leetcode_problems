// Last updated: 09/09/2026, 16:17:36
class Solution {
    public int minNumberOperations(int[] target) {
        final int n=target.length;
        int ans=target[0];
        for(int i=1; i<n; i++)
            ans+=Math.max(target[i]-target[i-1], 0);
        return ans;
    }
}