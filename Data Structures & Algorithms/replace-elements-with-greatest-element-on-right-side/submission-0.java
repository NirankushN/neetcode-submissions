class Solution {
    public int[] replaceElements(int[] arr) {
        int mx=arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(mx>arr[i]){
                arr[i]=mx;
            }else{
                int t=arr[i];
                arr[i]=mx;
                mx=t;
            }
        }
        return arr;
    }
}