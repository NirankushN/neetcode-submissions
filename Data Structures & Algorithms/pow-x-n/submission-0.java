class Solution {
    public double getP(double x,int n){
        if(n==0)
            return 1.0;
        double half=getP(x,n/2);
        if(n%2==0){
            return half*half;
        }
        return half*half*x;
    }
    public double myPow(double x, int n) {
        if(n<0){
            x=1/x;
            n=-n;
        }
        return getP(x,n);
    }
}
