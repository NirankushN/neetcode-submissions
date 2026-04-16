class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        String res="";
        while(i<word1.length() && j<word2.length()){
            res+=String.valueOf(word1.charAt(i++)) + String.valueOf(word2.charAt(j++));
        }
        if(i>=word1.length()){
            res+=word2.substring(j);
        }
        if(j>=word2.length()){
            res+=word1.substring(i);
        }
        return res;
    }
}