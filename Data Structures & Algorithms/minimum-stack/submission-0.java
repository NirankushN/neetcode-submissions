class MinStack {
    public int[] s;
    private int MAX_SIZE=1000;
    private int head=-1;
    public MinStack() {
        s=new int[MAX_SIZE];
    }
    
    public void push(int val) {
        s[++head]=val;
    }
    
    public void pop() {
        if(head<0){
            return;
        }
        head--;
    }
    
    public int top() {
        return s[head];
    }
    
    public int getMin() {
        int i=s[head];
        int ti=head;
        System.out.println(" ti = "+ti + " s[head]= "+ s[head]);
        while(ti>=0){
            if(i>s[ti]){
                i=s[ti];
            }
            ti--;
        }
        return i;
    }
}
