// Last updated: 09/09/2026, 16:14:54
class Solution {
    public boolean checkOnesSegment(String s) {
        int count=0;
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1' && flag==true){
                count++;
                flag=false;
            }
            else if(s.charAt(i)=='0'){
                flag=true;
            }
        }
        if(count ==1 || count==0){
            return true;
        }
        return false;
    }
}