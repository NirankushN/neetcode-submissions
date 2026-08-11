class Solution {
    public int[] findMin(int[] nums, int m){
        int min=nums[0], id=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                id=i;
            }
        }
        nums[id]=nums[id]*m;
        return nums;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        for(int i=0;i<k;i++){
            nums=findMin(nums,multiplier);
        }
        return nums;
    }
}