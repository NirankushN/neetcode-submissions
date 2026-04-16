class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.isLetterOrDigit(s.charAt(i))&& Character.isLetterOrDigit(s.charAt(j))){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}
