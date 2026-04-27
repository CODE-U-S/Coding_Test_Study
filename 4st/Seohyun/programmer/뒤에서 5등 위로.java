import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        Arrays.sort(num_list);
        
        for(int i=0; i<num_list.length - 5; i++){
            list.add(num_list[i+5]);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}