// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int rightSum = 0;
        for (int i = 1; i < A.length; i++) {
            rightSum += A[i];
        }
        
        int leftSum = A[0];
        int minDifference = Math.abs(leftSum - rightSum);
        for (int i = 1; i < A.length; i++) {
            int difference = Math.abs(leftSum - rightSum);
            if (difference < minDifference) {
                minDifference = difference;
            }
            leftSum += A[i];
            rightSum -= A[i];
        }
        return minDifference;
    }
}