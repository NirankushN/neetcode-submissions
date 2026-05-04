class Solution {
    public int islandPerimeter(int[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            int prev=-1;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    if(prev==1){
                        continue;
                    }else{
                        res+=2;
                    }
                    prev=1;
                }else{
                    prev=0;
                    continue;
                }
            }
        }

        for(int i=0;i<grid[0].length;i++){
            int prev=-1;
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==1){
                    if(prev==1){
                        continue;
                    }else{
                        res+=2;
                    }
                    prev=1;
                }else{
                    prev=0;
                    continue;
                }
            }
        }
        return res;
    }
}