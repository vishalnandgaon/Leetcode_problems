// Last updated: 09/09/2026, 16:24:58
class Solution {
    public boolean rotateString(String s, String goal) {
        int l1=s.length();
        int l2=goal.length();
        if(l1!=l2) return false;

        s=s+s;
        for(int i=0;i<l1;i++){
            if(s.substring(i,i+l1).equals(goal)){
                return true;
            }
        }
        return false;
    }
}