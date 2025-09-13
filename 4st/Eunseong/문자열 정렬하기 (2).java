import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.toLowerCase();
        char[] ch = answer.toCharArray();
        Arrays.sort(ch);
        answer = new String(ch);
        return answer;
    }
}