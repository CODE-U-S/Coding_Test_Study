import java.util.*;

class Solution {
    public List solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String s = i + "";
            boolean bool = true;
            for (char c : s.toCharArray()) {
                if (c != '0' && c != '5') {
                    bool = false;
                }
            }
            if (bool) {
                answer.add(i);
            }
        }
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        
        return answer;
    }
}