// Last updated: 16/09/2025, 18:01:30
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder st=new StringBuilder();
        int sum=0,start=0,end=0;
        while(end<s.length()){
            if(s.charAt(end)=='(') sum++;
            else sum--;
            if(sum==0){
                st.append(s.substring(start+1,end));
                start=end+1;
            }
            end++;
        }
        return st.toString();
    }
}