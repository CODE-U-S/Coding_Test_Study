import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String t = s;

        for (int i = 0; i < s.length(); i++) {
            t = left(t);
            Stack<Character> st = new Stack<>();
            boolean isValid = true;
            for (int j = 0; j < t.length(); j++) {
                char c = t.charAt(j);
                if (c == '(' || c == '{' || c == '[') {
                    st.push(c);
                } else {
                    if (st.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    char top = st.pop();
                    if (!isMatch(top, c)) {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid && st.isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
    boolean isMatch(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }
    String left(String t) {
        StringBuilder s = new StringBuilder(t);
        s.append(s.charAt(0));
        s.deleteCharAt(0);
        return s.toString();
    }
}
