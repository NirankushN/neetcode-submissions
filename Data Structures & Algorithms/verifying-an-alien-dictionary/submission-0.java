class Solution {

    // solve using the AI
    private boolean isCorrectlySorted(String word1, String word2, int[] orderMap) {
        int len1 = word1.length();
        int len2 = word2.length();
        int minLen = Math.min(len1, len2);
        for (int i = 0; i < minLen; i++) {
            char char1 = word1.charAt(i);
            char char2 = word2.charAt(i);

            if (char1 != char2) {
                int pos1 = orderMap[char1 - 'a'];
                int pos2 = orderMap[char2 - 'a'];
                return pos1 < pos2;
            }
        }

        return len1 <= len2;
    }

    public boolean isAlienSorted(String[] words, String order) {
        int[] alienOrderMap = new int[26];
        for (int i = 0; i < order.length(); i++) {
            alienOrderMap[order.charAt(i) - 'a'] = i;
        }

        // Compare adjacent pairs of words
        for (int i = 0; i < words.length - 1; i++) {
            if (!isCorrectlySorted(words[i], words[i + 1], alienOrderMap)) {
                return false;
            }
        }

        return true;
    }
}