// Last updated: 01/12/2025, 22:46:35
class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()<k) return "0";
        Stack<Character> st=new Stack<>();
        for(char ch:num.toCharArray()){
            while(!st.isEmpty() && ch<st.peek() && k>0){
                st.pop();
                k--;
            }
            st.push(ch);
        }

        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }

        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        sb.reverse();
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        return sb.length()==0 ? "0" : sb.toString(); 
    }
}