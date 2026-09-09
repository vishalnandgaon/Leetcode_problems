// Last updated: 09/09/2026, 16:04:32
class Solution {
    private boolean ischar(char ch){
        return "abcdefghijklmnopqrstuvwxyz".indexOf(ch)>=0;
    }
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!ischar(s.charAt(i)) && !stack.isEmpty() && ischar(stack.peek())){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty()) return "";
        StringBuilder st=new StringBuilder();
        while(!stack.isEmpty()){
            st.append(stack.pop());
        }
        st.reverse();
        return st.toString();
    }
}