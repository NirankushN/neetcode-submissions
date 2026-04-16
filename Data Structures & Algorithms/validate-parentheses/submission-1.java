class Solution {
    public boolean isValid(String ss) {
        Stack<Character> s=new Stack<Character>();
        for(int i=0;i<ss.length();i++){
            char c=ss.charAt(i);
            if(c =='{' || c=='(' || c=='[' ){
                s.push(c);
            }else{
                if(s.empty())
                    return false;
                
                if(c=='}'){
                    if(s.peek()!='{')
                        return false;
                }
                if(c==')'){
                    if(s.peek()!='(')
                        return false;
                }if(c==']'){
                    if(s.peek()!='[')
                        return false;
                }
                s.pop();
            }
        }
        return s.empty();
    }
}
