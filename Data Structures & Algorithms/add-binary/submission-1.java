class Solution {
    public String addBinary(String a, String b) {
        
        String c="0";
        String s="";
        int i=a.length()-1;
        int j=b.length()-1;
        int cnt=1;
        while(i>=0 && j>=0){
            if(b.charAt(j)=='1' && a.charAt(i)=='1' ){
                if(c=="0"){
                    s="0"+s;
                }else{
                    s="1"+s;
                }
                c="1";
            }else if((b.charAt(j)=='1' && a.charAt(i)=='0') || (b.charAt(j)=='0' && a.charAt(i)=='1')){
                if(c=="0"){
                    s="1"+s;
                }else{
                    s="0"+s;
                    c="1";
                }
            }else{
                s=c+s;
                c="0";
            }
            j--;
            i--;
            
        }
            while(j>=0){
                if(b.charAt(j)=='1' && c=="1"){
                    s="0"+s;
                    c="1";
                }else if((b.charAt(j)=='0' && c=="1") || (b.charAt(j)=='1' && c=="0") ){
                    s="1"+s;
                    c="0";
                }else{
                     s="0"+s;
                    c="0";
                }
                j--;
            }
         
        while(i>=0){
                 if(a.charAt(i)=='1' && c=="1"){
                    s="0"+s;
                    c="1";
                }else if((a.charAt(i)=='0' && c=="1") || (a.charAt(i)=='1' && c=="0") ){
                    s="1"+s;
                    c="0";
                }else{
                     s="0"+s;
                    c="0";
                }
                i--;
        }
        if(c=="1")
            s="1"+s;
        return s;
    }
}