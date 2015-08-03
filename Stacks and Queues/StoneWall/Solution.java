// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] H) {
        
        Stack<Integer> stack = new Stack();
        
        int numberOfBlocks = 0;
        for (int i = 0; i < H.length; i++) {
            while(!stack.isEmpty()) {
                int top = stack.peek();
                if (H[i] > top) {
                    stack.push(H[i]);
                    numberOfBlocks++;
                    break;
                } else if (H[i] < top) {
                    stack.pop();
                } else {
                    break;
                }
            }
            if (stack.isEmpty()) {
                stack.push(H[i]);
                numberOfBlocks++;
            }
        }
        
        return numberOfBlocks;
    }
}