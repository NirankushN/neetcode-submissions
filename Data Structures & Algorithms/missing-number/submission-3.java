class Solution {
    public int missingNumber(int[] nums) {
        int xr=0;
        for(int i=0;i<nums.length;i++){
            xr^=nums[i];
        }
        //return (nums.length*(nums.length+1))/2-sm;
        int cx=0;
        for(int i=0;i<nums.length+1;i++){
            cx^=i;
        }

        return cx^xr;
    }
}
