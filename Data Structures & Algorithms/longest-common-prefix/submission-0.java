class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res=strs[0];
        for(int i=1;i<strs.length;i++){
            int m=0;
            while(m<res.length() && m<strs[i].length() && res.charAt(m)==strs[i].charAt(m)){
                m+=1;
            }
            res=res.substring(0,m);
        }

        return res;
    }
}