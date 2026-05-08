class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2){
            return 0;
        }
        int sm=0,i=0,j=i+1;
        while(j<prices.length){
            if(!(prices[j]>prices[j-1])){
                sm+=prices[j-1]-prices[i];
                i=j;
            }
            j++;
        }
        if(i!=j){
            sm+=prices[j-1]-prices[i];
        }
        return sm;
    }
}