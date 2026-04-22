class Solution {
    public int scoreOfString(String s) {
        int[] ai=new int[s.length()];
       for(int i=0;i<s.length();i++){
          ai[i] = (int)s.charAt(i);
        }
        int sm=0;
        for(int i=1;i<s.length();i+=1){
            int diff = ai[i]>ai[i-1]?ai[i]-ai[i-1]:ai[i-1]-ai[i];
            sm+=diff;
        }
        return sm; 
    }
}