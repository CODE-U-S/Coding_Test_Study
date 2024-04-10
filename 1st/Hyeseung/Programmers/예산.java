import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        for(int number : d) {
            if(budget < number) break;
            budget -= number;
            answer++;
        }
        
        return answer;
    }
}