class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] a=new int[5];
        for(char c:text.toCharArray()){
            switch(c){
                case 'b': a[0]++; break;
                case 'a': a[1]++; break;
                case 'l': a[2]++; break;
                case 'o': a[3]++; break;
                case 'n': a[4]++; break;
            }
        }
        a[2]=(int)a[2]/2;
        a[3]=(int)a[3]/2;
        int m=a[0];
        for(int i:a){
            if(m>i){
                m=i;
            }
        }

        return m;
    }
}