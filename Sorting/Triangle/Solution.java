// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A) {
        
        Arrays.sort(A);
        
        for (int i = 0; i < A.length-2; i++) {
            if ((long)A[i] + (long)A[i+1] > A[i+2]) {
                return 1;
            }
        }
        return 0;
    }
}