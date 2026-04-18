class Solution {
    public int maxArea(int[] heights) {
        int maxA=0;
        int i=0,j=heights.length-1;
        while(i<j){
            int t=(j-i)*Math.min(heights[j],heights[i]);
            if(t>maxA){
                maxA=t;
            }
            if(heights[j]>heights[i]){
                i++;
            }else{
                j--;
            }
        }
        return maxA;
    }
}
