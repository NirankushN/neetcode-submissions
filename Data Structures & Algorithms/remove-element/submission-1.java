class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,cnt=0;
        int end=nums.length;
        while(i<end){
            if(nums[i]==val){
                // shift i element to the right most
                int temp=nums[i];
                int tempidx=i;
                while((i+1)<end){
                    nums[i]=nums[i+1];
                    i++;
                }
                nums[i]=temp;
                i=tempidx;
                end-=1;
            }else{
                cnt+=1;
                i++;
            }
        }
        return cnt;
    }
}