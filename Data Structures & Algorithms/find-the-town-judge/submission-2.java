class Solution {
    public int findJudge(int n, int[][] trust) {
        int res=-1;
        if(trust.length<n-1){
            return -1;
        }

        res=trust[0][1];
        Set<Integer> lc=new HashSet<Integer>();
        for(int[] i:trust){
            if(res!=i[1] && lc.contains(i[1])){
                return -1;
            }else{
                lc.add(i[0]);
            }
        }
        return res;
    }
}