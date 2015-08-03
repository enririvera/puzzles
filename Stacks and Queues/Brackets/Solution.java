import java.util.*;

class Solution {
    public int solution(String S) {
        
        Stack<Character> stack = new Stack<Character>();
        
        for (char c : S.toCharArray()) {
            if (isOpeningCharacter(c)) {
                stack.push(c);
            } else if (!stack.isEmpty()){
                char top = stack.peek();
                if (!closingCharacterMatchesOpening(c, top)) {
                    return 0;
                } else {
                    stack.pop();
                }
            } else {
                return 0;
            }
        }
		
        return stack.isEmpty() ? 1 : 0;
    }
    
    private static boolean isOpeningCharacter(char c) {
        return c == '(' || c == '[' || c == '{';
    }
    
    private static boolean closingCharacterMatchesOpening(char closing, char opening) {
        return ((opening == '(' && closing == ')') ||
                (opening == '[' && closing == ']') ||
                (opening == '{' && closing == '}'));
    }
}