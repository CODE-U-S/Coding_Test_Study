import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String s = String.valueOf(n);
        
        for(int i =0; i < s.length(); i ++){
            answer += s.charAt(i) - '0';
        }

        return answer;
    }
}