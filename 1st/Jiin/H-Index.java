import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Integer[] descending = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        
        Arrays.sort(descending, Collections.reverseOrder());
        
        for(int i = 0; i < descending.length && i + 1 <= descending[i]; i++)
            answer++;
        
        return answer;
    }
}
