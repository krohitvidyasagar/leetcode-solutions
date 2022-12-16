class MyQueue {
    Stack<Integer> stk1, stk2;

    public MyQueue() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }
    
    public void push(int x) {
        stk1.push(x);
    }
    
    public int pop() {
        while(!stk1.empty()) {
            stk2.push(stk1.pop());
        }

        int ret = stk2.pop();

        while(!stk2.empty()) {
            stk1.push(stk2.pop());
        }

        return ret;
    }
    
    public int peek() {
        while(!stk1.empty()) {
            stk2.push(stk1.pop());
        }

        int ret = stk2.peek();

        while(!stk2.empty()) {
            stk1.push(stk2.pop());
        }

        return ret;
    }
    
    public boolean empty() {
        return stk1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */