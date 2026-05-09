class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If the window exceeds size k, remove the oldest element
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }
            
            // If add() returns false, the element already exists in the current k-range
            if (!window.add(nums[i])) {
                return true;
            }
        }
        
        return false;
    }
}