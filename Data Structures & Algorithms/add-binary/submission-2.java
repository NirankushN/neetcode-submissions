class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            
            // If sum is 0 -> append 0, carry 0
            // If sum is 1 -> append 1, carry 0
            // If sum is 2 -> append 0, carry 1
            // If sum is 3 -> append 1, carry 1
            sb.append(sum % 2);
            carry = sum / 2;
        }

        return sb.reverse().toString();

    }
        
}