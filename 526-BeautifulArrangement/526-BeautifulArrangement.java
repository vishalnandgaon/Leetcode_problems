// Last updated: 11/10/2025, 23:35:29
class Solution {
    public int countArrangement(int n) {
        boolean[] used = new boolean[n+1];
        return dfs(1, n, used);
    }
    
    private int dfs(int pos, int n, boolean[] used) {
        if(pos > n) return 1;
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(!used[i] && (i % pos == 0 || pos % i == 0)) {
                used[i] = true;
                count += dfs(pos+1, n, used);
                used[i] = false; // backtrack
            }
        }
        return count;
    }
}
