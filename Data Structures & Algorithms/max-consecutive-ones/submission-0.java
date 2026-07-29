class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mx=0,cnt=0;
        for(int i:nums){
            if(i==1){
                cnt+=1;
            }else{
                mx=mx>cnt?mx:cnt;
                cnt=0;
            }
        }
        mx=mx>cnt?mx:cnt;
        return mx;
    }
}