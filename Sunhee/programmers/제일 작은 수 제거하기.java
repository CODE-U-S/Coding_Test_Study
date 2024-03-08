import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        if (arr.length == 1) { 
            answer = new int[] {-1};
        } else {
            List<Integer> list = new ArrayList<>();
            for (int a : arr) { 
                list.add(a);
            }
            
            list.remove(Collections.min(list)); 
            answer = new int[arr.length - 1];
        
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i); 
            }
        }
        return answer;
    }
}