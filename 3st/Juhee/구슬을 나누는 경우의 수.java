import java.util.*;

class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        
        int[] num1 = new int[share];
        int[] num2 = new int[share];
        
        int a = 0;
        
        for (int i = balls; i > balls - share; i--) {
            num1[a++] = i;
        }
        
        for (int i = 1; i <= share; i++) {
            num2[i - 1] = i;
        }
        
        for (int i = 0; i < num1.length; i++) {
            answer = answer * num1[i] / num2[i];
        }
        
        return Integer.parseInt(answer + "");
    }
}
