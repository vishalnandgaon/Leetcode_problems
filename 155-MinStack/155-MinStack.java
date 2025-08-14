// Last updated: 14/08/2025, 11:34:08
class MinStack {
    Stack<Integer> st= new Stack<>();
    Stack<Integer> min= new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.size()==0){
            st.push(val);
            min.push(val);
        }
        else{
            st.push(val);
            if(min.peek()>val){
                min.push(val);
            }
            else{
                min.push(min.peek());
            }
        }
    }
    
    public void pop() {
        st.pop();
        min.pop();
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return min.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */