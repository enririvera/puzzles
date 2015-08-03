// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        if (A[A.length - 1] <= 0) {
            return 1;
        }
		
        int previous = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                if (previous == -1) {
                    if (A[i] != 1) {
                        return 1;
                    } else {
                        previous = A[i];
                    }
                } else if (A[i] > previous + 1) {
                    return previous + 1;
                }
                previous = A[i];
            }
        }
        
        return A[A.length-1] + 1;
    }
}