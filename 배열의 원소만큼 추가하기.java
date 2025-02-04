import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> tempList = new ArrayList<>();
        
        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                tempList.add(num);
            }
        }

        int[] answer = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            answer[i] = tempList.get(i);
        }
        
        return answer;
    }
}
