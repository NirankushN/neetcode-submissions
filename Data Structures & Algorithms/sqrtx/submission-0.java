class Solution {
    public int mySqrt(int s) {
        
        if (s == 0) return 0;

        double x = s; // Initial guess
        double root;
        
        while (true) {
            // Newton-Raphson formula
            root = 0.5 * (x + (s / x));

            // Check if the difference is within a very small precision
            if (Math.abs(root - x) < 0.0000001) {
                break;
            }
            x = root;
        }
        return (int)root;
    }
}