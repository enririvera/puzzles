import java.util.*;

class Solution {
    
    private static int NO_RESULT = -1;
    
    public int solution(int[] A) {
        
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                int top = stack.peek();
                if (A[top] == A[i]) {
                    stack.push(i);
                } else {
                    stack.pop();
                }
            }
        }
        
        if (stack.isEmpty()) {
            return NO_RESULT;
        } else {
            int candidate = A[stack.peek()];
            int count = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] == candidate) {
                    count++;
                }
            }
            if (count > A.length/2) {
                return stack.peek();
            } else {
                return NO_RESULT;
            }
        }
    }
}