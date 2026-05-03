class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> d = new ArrayDeque<Integer>();
        for(String s:operations){
            if(s.equals("+")){
                int p=d.pollLast();
                int k=d.peekLast();
                d.addLast(p);
                d.addLast(p+k);
                continue;
            }else if(s.equals("D")){
                d.addLast(2*d.peekLast());
                continue;
            }else if(s.equals("C")){
                d.pollLast();
                continue;
            }else{
                d.addLast(Integer.valueOf(s));
            }
        }
        //System.out.println(d);
        int sm=0;
        for(Object i:d.toArray()){
            sm+=(int)i;
        }
        return sm;
    }
}