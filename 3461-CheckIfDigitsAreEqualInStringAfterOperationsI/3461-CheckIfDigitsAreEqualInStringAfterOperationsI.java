// Last updated: 09/09/2026, 16:01:52
class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            sb.append((s.charAt(i)+s.charAt(i+1))%10);
        }
        if(sb.length()==2 && sb.charAt(0)==sb.charAt(1)){
            return true;
        }
        if(sb.length()==2){
            return false;
        }
        return hasSameDigits(sb.toString());
    }
}