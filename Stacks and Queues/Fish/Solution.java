// you can also use imports, for example:

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        
        Stack<Integer> downstreamFishes = new Stack();
        
        int upstreamFishes = 0;
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                downstreamFishes.push(A[i]);
            } else {
                upstreamFishes++;
                while (!downstreamFishes.isEmpty()) {
                    int firstFish = downstreamFishes.peek();
                    if (firstFish > A[i]) {
                        upstreamFishes--;
                        break;
                    } else {
                        downstreamFishes.pop();
                    }
                }
            }
        }
        
        return upstreamFishes + downstreamFishes.size();
    }
}