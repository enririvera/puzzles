// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A) {
        int n = A.length;
        Arrays.sort(A);
		
        int leftProduct = A[0] * A[1] * A[n-1];
        int rightProduct = A[n-1] * A[n-2] * A[n-3];
        if (leftProduct > rightProduct) {
            return leftProduct;
        } else {
            return rightProduct;
        }
    }
}