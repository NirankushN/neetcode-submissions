class Solution {

    public String fetchIndex(String s){
        char[] c= s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hs=new HashMap<String,List<String>>();
        for(int i=0;i<strs.length;i++){
            String idx= fetchIndex(strs[i]);
            if(hs.containsKey(idx)){
                hs.get(idx).add(strs[i]);
            }else{
                List<String> ls=new ArrayList<String>();
                ls.add(strs[i]);
                hs.put(idx,ls);
            }
        }
        return new ArrayList<>(hs.values());
    }
}
