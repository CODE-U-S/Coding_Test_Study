import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int cnt = 0;
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        LinkedHashSet<Integer> h = new LinkedHashSet<>();
        for (int i : arr) {
            h.add(i);
        }
        for (int i : h) {
            answer[cnt++] = i;
            if (cnt == answer.length) break;
        }
        return answer;
    }
}