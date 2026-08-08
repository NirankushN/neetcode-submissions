class Solution {
    public boolean isPerfectSquare(int num) {
        for(int i=0;i<=num;i++){
            int s=i*i;
            if(s>num){
                return false;
            }
            if(s==num){
                return true;
            }
        }
        return false;
    }
}