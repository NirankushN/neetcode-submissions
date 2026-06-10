class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int ast : asteroids) {
            boolean destroyed = false;
            
            // A collision ONLY happens if the stack top moves RIGHT (+) 
            // and the current asteroid moves LEFT (-)
            while (!stack.isEmpty() && stack.peek() > 0 && ast < 0) {
                int top = stack.peek();
                
                if (Math.abs(ast) > top) {
                    // Current asteroid is bigger: destroy the stack top and keep checking
                    stack.pop();
                    continue; 
                } else if (Math.abs(ast) == top) {
                    // Both are equal size: destroy both
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    // Stack top is bigger: current asteroid is destroyed
                    destroyed = true;
                    break;
                }
            }
            
            // If the current asteroid survived all collisions, push it
            if (!destroyed) {
                stack.push(ast);
            }
        }
        
        // Convert stack to primitive int array cleanly
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}
