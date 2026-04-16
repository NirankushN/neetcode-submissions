class Solution {
    public int[] plusOne(int[] digits) {
        int c=0;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
                c=1;
            }else{
                digits[i]=digits[i]+1;
                c=0;
            }
            if(c==0 && i>=0 ){
                break;
            }
        }

        if(c==1 ){
            int[] d=new int[digits.length+1];
            System.arraycopy(digits,0,d,1,digits.length);
            d[0]=1;
            return d;
        }
        
        return digits;
        
    }
}
