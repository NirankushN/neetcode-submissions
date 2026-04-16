class Solution {
    public int missingNumber(int[] nums) {
        int sm=0;
        for(int i=0;i<nums.length;i++){
            sm+=nums[i];
        }
        return (nums.length*(nums.length+1))/2-sm;
    }
}
