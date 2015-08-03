// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int east = 0;
        int passingCars = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                east++;
            } else {
                passingCars += east;
                if (passingCars > 1000000000) {
                    return -1;
                }
            }
        }
        
        return passingCars;
    }
}