class Solution {
  /// AI generated
    public int subsetXORSum(int[] nums) {
        int bitwiseOR = 0;
        
        // Combine all bits that appear in the array
        for (int num : nums) {
            bitwiseOR |= num;
        }
        
        // Multiply the combined bits by 2^(N-1)
        // (1 << (nums.length - 1)) calculates 2^(N-1) using bit shifting
        return bitwiseOR << (nums.length - 1);
    }
}