import java.util.Stack;

class Solution {
    public int solution(String s) {
        if (s.length() % 2 == 0) {
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (!st.isEmpty() && st.peek() == s.charAt(i)) {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }
            return (st.isEmpty()) ? 1 : 0; 
        } else {
            return 0;
        }
    }
}