// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int X, int[] A) {
        int[] path = new int[X+1];
        Arrays.fill(path, A.length + 1);
        // origin
        path[0] = -1;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X && path[A[i]] > i) {
                path[A[i]] = i;
            }
        }
        
        int time = 0;
        for (int i = 0; i < X + 1; i++) {
            if (path[i] == A.length + 1) {
                return -1;
            } else if (path[i] > time) {
                time = path[i];
            }
        }
        return time;
    }
}