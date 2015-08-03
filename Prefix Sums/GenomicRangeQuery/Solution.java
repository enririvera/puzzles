// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        
        char[] nucleotides = S.toCharArray();
        int[][] prefixSums = new int[nucleotides.length+1][3];
        for (int i = 0; i < nucleotides.length; i++) {
            prefixSums[i+1][0] = prefixSums[i][0];
            prefixSums[i+1][1] = prefixSums[i][1];
            prefixSums[i+1][2] = prefixSums[i][2];
            if (nucleotides[i] == 'A') {
                prefixSums[i+1][0]++;
            } else if (nucleotides[i] == 'C') {
                prefixSums[i+1][1]++;
            } else if (nucleotides[i] == 'G') {
                prefixSums[i+1][2]++;
            }
        }
        
        int[] minImpactFactors = new int[P.length];        
        for (int i = 0; i < P.length; i++) {
            int start = P[i];
            int end = Q[i];
            if (prefixSums[end+1][0] - prefixSums[start][0] > 0) {
                minImpactFactors[i] = 1;
            } else if (prefixSums[end+1][1] - prefixSums[start][1] > 0) {
                minImpactFactors[i] = 2;
            } else if (prefixSums[end+1][2] - prefixSums[start][2] > 0) {
                minImpactFactors[i] = 3;
            } else {
                minImpactFactors[i] = 4;
            }
        }
        
        return minImpactFactors;
    }    
}