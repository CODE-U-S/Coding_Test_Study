import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arrList.add(arr[i]);
            }
        }

        // 나누어 떨어지는 값이 없을 때
        if (arrList.size() == 0) {
            return new int[]{-1};
        }

        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }
}
