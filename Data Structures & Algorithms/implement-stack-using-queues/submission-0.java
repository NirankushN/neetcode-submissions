class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    // Pushes element x to the top of the stack
    public void push(int x) {
        // 1. Add new element to the empty queue (q2)
        q2.add(x);
        
        // 2. Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        
        // 3. Swap the names: q1 now holds the LIFO order
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    
    // Removes the element on the top of the stack and returns it
    public int pop() {
        return q1.remove();
    }
    
    // Returns the element on the top of the stack
    public int top() {
        return q1.peek();
    }
    
    // Returns true if the stack is empty
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */