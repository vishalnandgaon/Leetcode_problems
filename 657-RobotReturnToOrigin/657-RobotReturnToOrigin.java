// Last updated: 09/09/2026, 16:26:56
class Solution {
    public boolean judgeCircle(String moves) {
        int v=0;
        int h=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U') v++;
            if(moves.charAt(i)=='D') v--;
            if(moves.charAt(i)=='L') h--;
            if(moves.charAt(i)=='R') h++;
        }
        if(v==0 && h==0) return true;
        return false;
    }
}