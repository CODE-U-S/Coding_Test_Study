import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = new HashSet<>();
        for (int d : delete_list) {
            deleteSet.add(d);
        }

        List<Integer> result = new ArrayList<>();
        for (int a : arr) {
            if (!deleteSet.contains(a)) {
                result.add(a);
            }
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
