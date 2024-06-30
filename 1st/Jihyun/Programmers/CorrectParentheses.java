import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.add(s.charAt(i));
            }
            else if(stack.isEmpty()) {
                return false;
            }
            else {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}

public class CorrectParentheses {
    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.solution("(()(()))()"));  // true
    }
}