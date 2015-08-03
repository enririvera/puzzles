// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A) {
        if (A.length == 0) {
            return 0;
        }
		
        Arrays.sort(A);
        int distinctElements = 1;
        for(int i = 1; i < A.length; i++) {
            if (A[i] != A[i-1]) {
                distinctElements++;
            }
        }
        
        return distinctElements;
    }
}