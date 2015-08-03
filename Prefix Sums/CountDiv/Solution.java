// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B, int K) {
        if (A > B) {
            return 0;
        }
        
        int firstDivisor = -1;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                firstDivisor = i;
                break;
            }
        }
        
        if (firstDivisor == -1) {
            return 0;
        } else {
            return ((B - firstDivisor) / K) +1;
        }
    }
}