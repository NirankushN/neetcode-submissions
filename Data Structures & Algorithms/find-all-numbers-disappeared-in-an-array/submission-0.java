class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> hs= IntStream.of(nums).boxed().collect(Collectors.toCollection(TreeSet::new));
        List<Integer> rs=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!hs.contains(i)){
                rs.add(i);
            }
        }
        return rs;
    }
}