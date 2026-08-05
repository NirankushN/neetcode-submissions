class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<String, Integer> hms= new HashMap<String, Integer>();
        HashMap<String, Integer> hmt= new HashMap<String, Integer>();
        String news="";
        String newt="";
        int cnt=0;
        for(int i=0;i<s.length();i++){
            String c=s.substring(i,i+1);
            if(hms.containsKey(c)){
                news+=hms.get(c).toString();
            }else{
                cnt+=1;
                news+=cnt;
                hms.put(c,cnt);
            }
        }
        cnt=0;
        for(int i=0;i<t.length();i++){
            String c=t.substring(i,i+1);
            if(hmt.containsKey(c)){
                newt+=hmt.get(c).toString();
            }else{
                cnt+=1;
                newt+=cnt;
                hmt.put(c,cnt);
            }
        }

        //System.out.println(" news = "+ news);
        //System.out.println(" newt = "+ newt);
        return news.equals(newt);
    }
}