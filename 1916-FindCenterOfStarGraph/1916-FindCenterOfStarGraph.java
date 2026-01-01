// Last updated: 01/01/2026, 22:58:02
class Solution {
    public int findCenter(int[][] e) {
    return e[0][0] == e[1][0] || e[0][0] == e[1][1] ? e[0][0] : e[0][1];
}
}