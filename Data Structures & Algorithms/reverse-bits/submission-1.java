class Solution {
    public int reverseBits(int n) {
        String s=Integer.toBinaryString(n);
        for(int i=s.length();i<32;i++){
            s="0"+s;
        }
        //System.out.println(s + "  --  "+ s.length());
        s=new StringBuilder(s).reverse().toString();
        return Integer.parseUnsignedInt(s,2);
    }
}
