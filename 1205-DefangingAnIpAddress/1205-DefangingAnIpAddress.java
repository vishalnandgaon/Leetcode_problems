// Last updated: 14/09/2025, 21:36:51
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder st=new StringBuilder(address);
        char target='.';
        String replacement="[.]";
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==target){
                st.replace(i,i+1,replacement);
                i+=2;
            }
        }
        return st.toString();
    }
}