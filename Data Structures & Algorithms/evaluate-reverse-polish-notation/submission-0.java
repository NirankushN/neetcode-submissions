class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s=new Stack<String>();
        int a,b;
        for(String ss:tokens){
            switch(ss){
                case "+": 
                            a=Integer.valueOf(s.pop());
                            b=Integer.valueOf(s.pop());
                            s.push((b+a)+"");
                            break;
                case "-": 
                            a=Integer.valueOf(s.pop());
                            b=Integer.valueOf(s.pop());
                            s.push((b-a)+"");
                            break;
                case "*": 
                            a=Integer.valueOf(s.pop());
                            b=Integer.valueOf(s.pop());
                            s.push((b*a)+"");
                            break;
                case "/":
                            a=Integer.valueOf(s.pop());
                            b=Integer.valueOf(s.pop());
                            s.push((int)(b/a)+"");
                            break;
                default : s.add(ss);
            }
        }
        return Integer.valueOf(s.pop());
    }
}
