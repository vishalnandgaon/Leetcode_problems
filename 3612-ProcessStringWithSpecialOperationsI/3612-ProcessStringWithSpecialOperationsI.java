// Last updated: 09/09/2026, 15:59:33
class Solution {
    private boolean consist(char c){
        return "abcdefghijklmnopqrstuvwxyz".indexOf(c)!=-1;
    }
    public String processStr(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*' && sb.length()>=1){
                sb.deleteCharAt(sb.length()-1);
            }
            else if(s.charAt(i)=='#' && sb.length()>=1){
                sb.append(sb);
            }
            else if(s.charAt(i)=='%' && sb.length()>=1){
                sb=sb.reverse();
            }
            else if(consist(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}