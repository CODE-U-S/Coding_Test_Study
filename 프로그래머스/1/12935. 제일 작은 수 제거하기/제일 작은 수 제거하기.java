import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int min = arr[0];
        
        //빈 배열이 아닐 경우
        if (arr.length > 1) {
            for (int i = 0; i < arr.length; i++) {
                //최솟값 구하기
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != min) {
                    answer.add(arr[i]);
                }
            }
        }
        
        //빈 배열일 경우
        else {
            answer.add(-1);
        }
        
        int answerInt[] = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            answerInt[i] = answer.get(i);
        }
        
        return answerInt;
    }
}