// Last updated: 09/09/2026, 16:07:05
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int l=0;
        int r=0;
        int middle=0;
        for(int i=0;i<n;i++){
            if(moves.charAt(i)=='L') l++;
            else if(moves.charAt(i)=='R') r++;
            else middle++;
        }
        int max=Math.max(l,r);
        int min=Math.min(l,r);
        return max+middle-min;
    }
}