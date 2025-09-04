// Last updated: 04/09/2025, 10:31:56
class Solution {
    public int findClosest(int x, int y, int z) {
        int xdis=Math.abs(z-x);
        int ydis=Math.abs(z-y);
        if(xdis>ydis) return 2;
        if(xdis<ydis) return 1;
        else return 0;
    }
}