// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        
        int maxValue = 0;
        int lastUpdate = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N+1) {
                lastUpdate = maxValue;
            } else {
                if (counters[A[i]-1] < lastUpdate) {
                    counters[A[i]-1] = lastUpdate + 1;
                } else {
                    counters[A[i]-1]++;
                }
                
                if (counters[A[i]-1] > maxValue) {
                    maxValue = counters[A[i]-1];
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            if (counters[i] < lastUpdate) {
                counters[i] = lastUpdate;
            }
        }
        
        return counters;
    }
}