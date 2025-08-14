// Last updated: 14/08/2025, 11:33:39
class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        StringBuilder st = new StringBuilder();
        boolean negative=num<0;
        num=Math.abs(num);
        while(num>0){
            st.append(num%7);
            num/=7;
        }
        if(negative) st.append('-');
        return st.reverse().toString();
    }
}