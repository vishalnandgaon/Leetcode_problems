// Last updated: 19/09/2025, 18:31:50
class Solution {
    public String simplifyPath(String path) {
        String[] tem=path.split("/");
        Stack<String> stack=new Stack<>();
        for(String i:tem){
            if(i.equals("..") && !stack.isEmpty()){
                stack.pop();
            }
            else if(!i.equals("") && !i.equals(".") && !i.equals("..")){
                stack.push(i);
            }
        }
        StringBuilder st=new StringBuilder();
        for(String i:stack){
            st.append('/');
            st.append(i);
        }
        return st.length()==0 ? "/": st.toString();
    }
}