import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Stack<String> s1 = arrayToStringStack(cards1);
        Stack<String> s2 = arrayToStringStack(cards2);
        
        for (int i = 0; i < goal.length; i++) {
            if (!s1.isEmpty() && goal[i].equals(s1.peek())) {
                s1.pop();
            } else if (!s2.isEmpty() && goal[i].equals(s2.peek())) {
                s2.pop();
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
    Stack<String> arrayToStringStack(String[] arr) {
        Stack<String> s = new Stack();
        for (int i = arr.length - 1; i >= 0; i--) {
            s.push(arr[i]);
        }
        return s;
    }
}