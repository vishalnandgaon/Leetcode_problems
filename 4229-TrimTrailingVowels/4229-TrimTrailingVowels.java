// Last updated: 01/03/2026, 21:17:18
class Solution {
    public String trimTrailingVowels(String s) {
        int n=s.length()-1;
        StringBuilder sb=new StringBuilder();
        int i=n;
        for(int j=n;j>=0;j--){
            if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u'){
                i--;
            }
            else{
                break;
            }
        }
        sb.append(s.substring(0,i+1));
        return sb.toString();
    }
}