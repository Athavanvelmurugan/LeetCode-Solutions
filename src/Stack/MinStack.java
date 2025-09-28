class MinStack {
    private static Stack<Integer>stack1;
     private static Stack<Integer>stack2;
    public MinStack() {
        stack1=new Stack<>();
        stack2= new Stack<>();
    }
    
    public void push(int val) {
        stack1.push(val);

        if(stack2.isEmpty() || stack2.peek()>=val){
            stack2.push(val);
        }
    }
    
    public void pop() {
        if(!stack1.isEmpty()){
            int val=stack1.pop();
            if(!stack2.isEmpty()){
            if(val==stack2.peek()){
                stack2.pop();
            }
            }
        }
    }
    
    public int top() {
        if(stack1.isEmpty()){
            return -1;
        }
        return stack1.peek();
    }
    
    public int getMin() {
        if(stack2.isEmpty()){
            return -1;
        }
        return stack2.peek();
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
