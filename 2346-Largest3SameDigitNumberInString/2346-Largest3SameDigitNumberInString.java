// Last updated: 14/08/2025, 11:33:24
class Solution {
    public String largestGoodInteger(String num) {
        String ans="";
        int length=num.length();
        for(int i=0;i<length-2;i++){
            if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i+1)==num.charAt(i+2)){
                String triple=num.substring(i,i+3);
                if(ans.isEmpty() || triple.compareTo(ans)>0){
                    ans=triple;
                }
            }
        }
        return ans;
    }
}