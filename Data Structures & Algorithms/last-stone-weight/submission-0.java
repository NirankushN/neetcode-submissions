class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            maxHeap.add(i);
        }
        int a,b,res;
        while(maxHeap.size()>1){
            a=maxHeap.poll();
            b=maxHeap.poll();
            if(a-b>0){
                maxHeap.add(a-b);
            }
        }
        return maxHeap.size()<=0 ? 0 : maxHeap.poll();
    }
}
