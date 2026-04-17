class Solution {
    public static int[] ele=new int[46];
    public int countStairs(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(ele[n]!=0){
            return ele[n];
        }
        ele[n]=countStairs(n-1)+countStairs(n-2);
        return ele[n];
    }
    public int climbStairs(int n) {
        ele[1]=1;
        ele[2]=2;
        ele[n]=countStairs(n);
        return ele[n];
    }
}
