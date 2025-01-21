import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        
        int[] answer = Arrays.copyOfRange(num_list, 5, num_list.length);
        
        return answer;
    }
}
