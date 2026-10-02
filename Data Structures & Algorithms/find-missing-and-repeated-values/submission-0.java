class Solution {

    public static int findIndex(int a[], int t)
    {
        if (a == null)
            return -1;

        int len = a.length;
        int i = 0;

        while (i < len) {
            if (a[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
      
        return -1;
    }

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len=grid.length*grid.length;
        int[] a=new int[len];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                a[grid[i][j]-1]++;
            }
        }
        int ele=findIndex(a,2)+1;
        int m=findIndex(a,0)+1;

        return new int[]{ele,m};
    }
}