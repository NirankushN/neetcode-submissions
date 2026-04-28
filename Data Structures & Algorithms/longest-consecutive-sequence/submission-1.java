class Solution {
    public int longestConsecutive(int[] nums) {
        // to find the longest consequtive subsequence 
        int maxs=0;
        HashMap<Integer, Integer> hm= new HashMap<Integer,Integer>();
        for(int i:nums){
            if(!hm.containsKey(i)){
                hm.put(i,0);
            }
        }
        System.out.println(hm);
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            int temp=1;
            while(hm.containsKey(ele+1)&&hm.get(ele+1)==0){
                ele+=1;
                temp+=1;
                hm.put(ele,1);
            }
            ele=nums[i];
            while(hm.containsKey(ele-1)&&hm.get(ele-1)==0){
                ele-=1;
                temp+=1;
                hm.put(ele,1);
            }
            if(temp>maxs){
                maxs=temp;
            }
        }
        return maxs;
    }
}
