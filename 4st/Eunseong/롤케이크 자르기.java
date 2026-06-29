import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int len = topping.length;
        HashSet<Integer> elems = new HashSet<>();
        int[] leftCnt = new int[len];
        int[] rightCnt = new int[len];
        
        
        for (int i = 0; i < len; i++) {
            if (!elems.contains(topping[i])) {
                elems.add(topping[i]);
            }
            leftCnt[i] = elems.size();
        }
        elems.clear();
        for (int i = len - 1; i >= 0; i--) {
            if (!elems.contains(topping[i])) {
                elems.add(topping[i]);
            }
            rightCnt[i] = elems.size();
        }
        for (int i = 0; i < len - 1; i++) {
            if (leftCnt[i] == rightCnt[i + 1]) {
                answer++;
            }
        }
        
        return answer;
    }
}