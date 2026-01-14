import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer.add(arr[i]);
            }
        }
        
        int[] answer1 = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            answer1[i] = answer.get(i);
        }
        return answer1;
    }
}