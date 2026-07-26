class Solution {
    public int appendCharacters(String s, String t) {
        int cnt=0;
        int i=0,j=0;
        int tmpMx=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
                tmpMx+=1;
            }else{
                if(tmpMx>cnt){
                    cnt=tmpMx;
                }
                i++;
            }
        }
        if(tmpMx>cnt){
                    cnt=tmpMx;
                    tmpMx=0;
        }
        return t.length()-cnt;
    }
}