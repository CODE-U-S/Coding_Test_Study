import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        // X와 Y에서 각 숫자의 빈도수를 센다.
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }
        
        // 공통된 숫자들을 찾아 내림차순으로 추가한다.
        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(countX[i], countY[i]);
            for (int j = 0; j < commonCount; j++) {
                answer.append(i);
            }
        }
        
        // 공통 숫자가 없으면 "-1" 반환
        if (answer.length() == 0) {
            return "-1";
        }
        
        // "000..."을 방지하고 "0"을 반환
        if (answer.charAt(0) == '0') {
            return "0";
        }
        
        return answer.toString();
    }
}