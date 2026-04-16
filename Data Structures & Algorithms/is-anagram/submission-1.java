class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ss=new int[26];
        s= s.toLowerCase();
        t=t.toLowerCase();
        for(char c: s.toCharArray()){
            ss[(int)c - 97]+=1;
        }

        for(char c: t.toCharArray()){
            ss[(int)c - 97]-=1;
        }

        int flag=0;
        
        for(int i:ss){
            if(i!=0){
                flag=1;
                break;
            }
        }
        return flag>0?false:true;
    }
}
