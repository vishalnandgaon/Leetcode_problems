// Last updated: 02/09/2025, 13:49:12
class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2,
                           int bx1, int by1, int bx2, int by2) {

        int length1 = ax2 - ax1;
        int breadth1 = ay2 - ay1;
        int length2 = bx2 - bx1;
        int breadth2 = by2 - by1;

        int total_area = length1 * breadth1 + length2 * breadth2;

        int overlapleft = Math.max(ax1, bx1);
        int overlapright = Math.min(ax2, bx2);
        int overlaptop = Math.min(ay2, by2);
        int overlapbottom = Math.max(ay1, by1);

        int overlaparea = 0;

        if (overlapright > overlapleft && overlaptop > overlapbottom) {
            overlaparea = (overlapright - overlapleft) * (overlaptop - overlapbottom);
        }

        return total_area - overlaparea;
    }
}
