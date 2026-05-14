class Solution {
    public int getTribonacci(int a,int[] res){
        if(a==0){
            return 0;
        }
        if(a==1){
            return 1;
        } 
        if(a==2){
            return 1;
        }
        if(res[a]>0){
            return res[a];
        }
        res[a]=getTribonacci(a-1,res) + getTribonacci(a-2,res) +getTribonacci(a-3,res);
        return res[a];
    }
    public int tribonacci(int n) {
        if(n<3){
            if(n==0){
                return 0;
            }
            return 1;
        }
        int[] res=new int[n+1];
        res[0]=0;
        res[1]=1;
        res[2]=1;
        return getTribonacci(n,res);
    }
}