class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        if(t.length()<s.length()){
            return false;
        }
        while(i<s.length()&& j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        System.out.println("characters with value : "+ i);
        if(i>=s.length()){
            return true;
        }
        return false;
    }
}