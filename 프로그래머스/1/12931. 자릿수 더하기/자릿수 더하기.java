import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String num = Integer.toString(n);
        
        for (int i = 0; i < num.length(); i++) {
            answer += num.charAt(i) - '0';
        }

        return answer;
    }
}