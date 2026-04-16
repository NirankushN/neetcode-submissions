class Solution {
    public int[] getConcatenation(int[] nums) {
        int j=0,i=0;
        int[] newA=new int[2*nums.length];
        while(j<2*nums.length){
            if(i==nums.length){
                i=0;
            }
            newA[j++] = nums[i++];

        }
        return newA;
    }
    
}