// Last updated: 14/09/2025, 21:36:39
class Solution {
    public String interpret(String command) {
        StringBuilder st= new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                st.append('G');
            }
            else{
                if(command.charAt(i)=='(') continue;
                if(command.charAt(i)==')'){
                    st.append('o');
                }
                else{
                    st.append("al");
                    i+=2;
                }
            }
        }
        return st.toString();
    }
}