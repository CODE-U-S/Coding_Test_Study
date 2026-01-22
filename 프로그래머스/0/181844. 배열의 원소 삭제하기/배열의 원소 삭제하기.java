import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : delete_list) {
            set.add(x);
        }
        
        ArrayList<Integer> tempList = new ArrayList<>();
        for (int x : arr) {
            if (!set.contains(x))
                tempList.add(x);
        }
        
        int[] answer = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            answer[i] = tempList.get(i);
        }
        return answer;
    }
}