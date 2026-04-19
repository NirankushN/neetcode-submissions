class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot is empty
            if (flowerbed[i] == 0) {
                // Check if left and right plots are empty or out of bounds
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // Plant the flower
                    count++;
                    
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }
        return count >= n;
    }
}