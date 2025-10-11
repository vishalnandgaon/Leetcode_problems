// Last updated: 11/10/2025, 23:35:02
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] score = new int[n+1];
        for(int[] t : trust) {
            score[t[0]]--; // trusts someone → cannot be judge
            score[t[1]]++; // trusted by someone
        }
        for(int i=1;i<=n;i++)
            if(score[i]==n-1) return i;
        return -1;
    }
}
