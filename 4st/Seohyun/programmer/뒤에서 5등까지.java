import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        Arrays.sort(num_list);
        
        for(int i=0; i<5; i++) {
            arr.add(num_list[i]);
        }
        
        int[] answer = new int[arr.size()];
        
        for(int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}