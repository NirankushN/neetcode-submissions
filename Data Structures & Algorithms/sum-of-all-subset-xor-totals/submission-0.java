class Solution {
  /// AI generated
    private int getXORSum(int[] nums, int index, int currentXOR) {
        // Base case: if we've made a decision for all elements
        if (index == nums.length) {
            return currentXOR;
        }

        // Choice 1: Include the current element in our subset
        int include = getXORSum(nums, index + 1, currentXOR ^ nums[index]);

        // Choice 2: Exclude the current element from our subset
        int exclude = getXORSum(nums, index + 1, currentXOR);

        // Return the combined sum of both decision paths
        return include + exclude;
    }
    
    public int subsetXORSum(int[] nums) {
         return getXORSum(nums, 0, 0);
    }
}