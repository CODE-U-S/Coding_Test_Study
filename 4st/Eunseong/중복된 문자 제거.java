import java.util.*;

class Solution {
    public String solution(String my_string) {
        LinkedHashSet<Character> alp = new LinkedHashSet();
        for (int i = 0; i < my_string.length(); i++) {
            alp.add(my_string.charAt(i));
        }
        StringBuilder answer = new StringBuilder();
        for (char ch : alp) {
            answer.append(ch);
        }
        return answer.toString();
    }
}