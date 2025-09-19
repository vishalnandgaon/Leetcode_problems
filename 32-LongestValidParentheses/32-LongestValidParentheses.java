// Last updated: 19/09/2025, 18:32:27
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        int maxlen=0;
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else{
                stack.pop();

                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    maxlen=Math.max(maxlen,i-stack.peek());
                }

            }
        }
        return maxlen;
    }
}