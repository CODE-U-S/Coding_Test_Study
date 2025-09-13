import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char c[] = my_string.toCharArray();
        for(int i = 0; i < c.length; i++) {
            for(int j = 0; j < n; j++) {
                answer += c[i];
            }
        }
        return answer;
    }
}