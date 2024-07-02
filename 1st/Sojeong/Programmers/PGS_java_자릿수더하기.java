package Sojeong.Programmers;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String strN = String.valueOf(n);
        
        for (char c : strN.toCharArray()) {
            int digit = Character.getNumericValue(c);
            answer += digit;
        }
        
        return answer;
    }
}
