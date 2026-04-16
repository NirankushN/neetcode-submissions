class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<Integer>();
        while(true){
            int sm=String.valueOf(n).chars()
                    .map(Character::getNumericValue)
                    .map(d -> d * d)
                    .sum();
            n=sm;
            if(sm==1){
                return true;
            }else{
                if(!hs.contains(sm)){
                    hs.add(sm);
                }else{
                    return false;
                }
            }
        }
    }
}
