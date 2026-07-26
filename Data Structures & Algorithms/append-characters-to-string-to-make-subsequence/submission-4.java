class Solution {
    public int appendCharacters(String s, String t) {
        int cnt=0;
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                j++;
                cnt+=1;
            }
            i++;
        }
        return t.length()-cnt;
    }
}