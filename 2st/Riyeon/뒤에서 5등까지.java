import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);        
        int[] answer = new int[5];
        for(int i=0; i<answer.length; i++)
            answer[i] = num_list[i];
        
        return answer;
    }
}