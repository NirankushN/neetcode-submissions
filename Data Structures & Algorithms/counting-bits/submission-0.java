class Solution {
    public int[] countBits(int n) {
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++){
            // use dp
            // here the current is the previous + set bit if any of present
            //System.out.println(" for I= " + i + " , " + dp[i-1]+" "+(i&1)+" ");
            dp[i]=dp[i>>1]+(i&1);
            //System.out.println(" for I= " + i + " , " + dp[i] + " "+  dp[i-1]+" "+(i&1)+" ");
            
        }
        return dp;
    }
}
