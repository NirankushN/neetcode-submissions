
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Find the maximum pile size to define our binary search boundary
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            if (pile > high) {
                high = pile;
            }
        }
        
        int result = high;
        
        // Binary search for the minimum valid speed 'k'
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canEatAll(piles, h, mid)) {
                result = mid;     // 'mid' is a valid speed, record it
                high = mid - 1;   // Try to find an even smaller valid speed
            } else {
                low = mid + 1;    // 'mid' is too slow, increase the speed
            }
        }
        
        return result;
    }
    
    // Helper function to check if Koko can eat all bananas within 'h' hours at speed 'k'
    private boolean canEatAll(int[] piles, int h, int k) {
        long totalHours = 0; // Use long to prevent integer overflow during accumulation
        
        for (int pile : piles) {
            // Equivalent to Math.ceil((double) pile / k) without floating-point issues
            totalHours += (pile + k - 1) / k; 
            
            // Optimization: If hours already exceed 'h', no need to check further
            if (totalHours > h) {
                return false;
            }
        }
        
        return totalHours <= h;
    }
}