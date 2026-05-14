class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0,j=nums.length-1;
        int mid=0;
        while(i<=j){
            mid=(int)(i+j)/2;
            if(nums[mid]==target){
                return mid;
            }else{
                if(target>nums[mid]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }

        }
        if(nums[mid]>target){
            return mid;
        }
        return mid+1;
    }
}