class Solution {

    public int removeDuplicates(int[] nums) {
        int[] found=new int[202];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(found[nums[i]+100]==0){
                nums[k]=nums[i];
                found[nums[i]+100]=1;
                k++;
            }
        }
        return k;
    }
}