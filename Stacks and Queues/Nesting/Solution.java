// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(String S) {
        
        Stack stack = new Stack();
        
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (!stack.isEmpty()){
                stack.pop();
            } else {
                return 0;
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}