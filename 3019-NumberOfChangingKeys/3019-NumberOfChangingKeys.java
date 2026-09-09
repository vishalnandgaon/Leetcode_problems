// Last updated: 09/09/2026, 16:05:41
class Solution {
    public int countKeyChanges(String s) {
        int count=0;
        char start=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(Math.abs(s.charAt(i)-start)!=32){
                count++;
            }
            if(Math.abs(start-s.charAt(i))==0){
                count--;
            }
            start=s.charAt(i);
        }
        return count;
    }
}