class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] res=new int[temp.length];
        for(int i=0;i<temp.length-1;i++){
            int k=0;
            for(int j=i+1;j<temp.length;j++){
                if(temp[i]<temp[j]){
                    k=j;
                   break;
                }
            }
            if(k==0)continue;
            res[i]=k-i;
        }
        return res;
    }
}
