import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        int recent = 10;
        
        for (int i : arr) {
            if (i == recent) {
                continue;
            } else {
                recent = i;
                temp.add(i);
            }
        }
        int answer[] = new int[temp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}