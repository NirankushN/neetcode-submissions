class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<Integer>();
        if(nums.length<2){
            l.add(nums[0]);
            return l;
        }
        if(nums.length<3){
            l.add(nums[0]);
            l.add(nums[1]);
            return l;
        }
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i:nums){
            if(hm.containsKey(i)){
                if((hm.get(i)+1)>(nums.length/3)){
                    if(!l.contains(i)){
                        l.add(i);
                    }
                }
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        return l;
    }
}