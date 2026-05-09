class Solution {
    public void shiftArrayElementToRight(int[] arr, int pos, int m){
        //shift ryt
        while(m-1>=pos){
            arr[m]=arr[m-1];
            m-=1;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x=0,y=0;
        while(x<m && y<n){
            if(nums1[x]>=nums2[y]){
                if(m>=nums1.length){
                    break;
                }
                shiftArrayElementToRight(nums1,x,m);
                nums1[x++]=nums2[y++];
                m+=1;
                
            }else{
                x++;
            }
        }
        if(y<n)
        {   
            while(y<n){
                nums1[m++]=nums2[y++];
            }
        }
    }
}