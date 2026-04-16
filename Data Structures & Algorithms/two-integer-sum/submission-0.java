class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int tar=target-nums[i];
            if(hm.containsKey(tar)){
                res[0]=hm.get(tar);
                res[1]=i;
            }else{
                hm.put(nums[i],i);
            }
        }
        return res;
    }
}
