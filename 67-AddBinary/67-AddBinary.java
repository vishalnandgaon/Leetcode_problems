// Last updated: 14/08/2025, 11:34:29
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder st= new StringBuilder();
        int i=a.length()-1;
        int j= b.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry>0){
            int a1=(i>=0)?a.charAt(i--)-'0':0;
            int b1=(j>=0)?b.charAt(j--)-'0':0;
            int sum= a1+ b1+carry;
            st.append(sum%2);
            carry=sum/2;
        }
        return st.reverse().toString();
        
    }
}