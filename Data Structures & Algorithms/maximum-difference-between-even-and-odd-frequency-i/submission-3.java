class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> hm = new HashMap<>();

        int maxo = 0;
        int maxe = 101;

        for (char c : s.toCharArray()) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }

       for (Integer i : hm.values()) {
            if (i % 2 == 0) {
                maxe = Math.min(maxe, i);
            } else {
                maxo = Math.max(maxo, i);
            }
        }
        return maxo - maxe;
    }
}