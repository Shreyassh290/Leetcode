class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> hp=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.size()==0){
            st.push(val);
            hp.push(val);
        }
        else if(val<hp.peek()){
            st.push(val);
            hp.push(val);
        }
        else{
            st.push(val);
            hp.push(hp.peek());
        }
    
    }
    
    public void pop() {
        st.pop();
        hp.pop();
    }
    
    public int top() {
       return st.peek();
    }
    
    public int getMin() {
        
        return hp.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */