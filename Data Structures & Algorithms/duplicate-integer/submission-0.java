class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ts= new HashSet<Integer>();
        for(int i:nums){
            int prev_size=ts.size();
            ts.add(i);
            if(ts.size()==prev_size){
                return true;
            }
        }
        return false;
    }
}