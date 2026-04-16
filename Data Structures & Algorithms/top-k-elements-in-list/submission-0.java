class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        int[] numk=new int[3000];
        for(int i=0;i<nums.length;i+=1){
            numk[nums[i]+1500]+=1;
        }

        // created a bucket
        TreeMap<Integer, List<Integer>> tm=new TreeMap<Integer, List<Integer>>();
         for(int i=0;i<3000;i+=1){
            if(numk[i]>0){
                int freq=numk[i];
                int elem=i-1500;
                if(tm.containsKey(freq)){
                    tm.get(freq).add(elem);
                }else{
                    List<Integer> nl= new ArrayList<Integer>();
                    nl.add(elem);
                    tm.put(freq,nl);
                }
            }
        }

        int i=0;
        while(i<k){
            List<Integer> l = tm.get(tm.lastKey());
            for(Integer in:l){
                res[i++] = in;
                if(i==k){
                    return res;
                }
            }
            if(i<k){
                tm.remove(tm.lastKey());
            }
        }

        return res;
    }
}
