import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i += n) {
            answerList.add(num_list[i]);
        }
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}