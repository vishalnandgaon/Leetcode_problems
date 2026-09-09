// Last updated: 09/09/2026, 16:14:46
class Solution {
    public int findCenter(int[][] e) {
        return (e[0][0]==e[1][0] || e[0][0]==e[1][1]) ? e[0][0] : e[0][1];
}
}