class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        
        // Map to store: Key = Character, Value = Last seen index
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If we've seen this char and it's inside our current window
            if (map.containsKey(currentChar)) {
                // Move 'left' to the right of the previous occurrence
                left = Math.max(left, map.get(currentChar) + 1);
            }

            // Update the last seen position of the character
            map.put(currentChar, right);
            
            // Calculate the window size and update max
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
