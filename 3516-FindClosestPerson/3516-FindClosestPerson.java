// Last updated: 09/09/2026, 16:01:04
class Solution {
    public int findClosest(int x, int y, int z) {
        int xdis=Math.abs(z-x);
        int ydis=Math.abs(z-y);
        if(xdis>ydis) return 2;
        if(xdis<ydis) return 1;
        else return 0;
    }
}