// Last updated: 09/09/2026, 16:27:48
class Solution {
    public String reverseWords(String s) {
        String[] st=s.split(" ");
        for(int i=0;i<st.length;i++){
            st[i]=reverse(st[i]);
        }
        String s2="";
        for(int i=0;i<st.length;i++){
            s2=s2+st[i]+" ";
        }
        return s2.trim();

    }
    private String reverse(String s1){
        int j=s1.length()-1;
        String ans="";
        while(j>=0){
            ans=ans+s1.charAt(j);
            j--;
        }
        return ans;
    }
}