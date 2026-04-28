class Solution {

    public String encode(List<String> strs) {
        String res="";
        for(int i=0;i<strs.size();i++){
            String s=strs.get(i);
            res+=s.length()+ "#" + s;
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> s=new ArrayList<String>();
        System.out.println(str);
        for (int i=0;i<str.length();) {
        if (Character.isDigit(str.charAt(i))){
            int begi=i;
            int len=1;
            while((i+1)<str.length() && Character.isDigit(str.charAt(i+1))){
                i+=1;
                len++;
            }
            int size=Integer.valueOf(str.substring(begi,begi+len));
            if((i+1)<str.length() && str.charAt(i+1)=='#'){
                s.add(str.substring(i+2,i+2+size));
                i=i+2+size;
                
            }else{
                i++;
            }
        }else{
            i++;
        }
        }
        
        return s;
    }
}
