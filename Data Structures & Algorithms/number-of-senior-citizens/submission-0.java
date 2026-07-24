class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;
        for(String i:details){
            int age=Integer.parseInt(i.substring(11,13));
            if(age>60){
                cnt+=1;
            }
        }
        return cnt;
    }
}