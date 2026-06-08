class Solution {
    public void rotate(int[] nums, int k) {
        int[] j=new int[nums.length];
        int idx=0;
        for(int i:nums){
            j[idx++]=i;
        }
        for(int i=0;i<nums.length;i++){
            idx=(i+k)%nums.length;
            nums[idx]=j[i];
        }
    }
}