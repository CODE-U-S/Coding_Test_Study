import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        for (String s : keymap) {
            for (int i = 0; i < s.length(); i++) {
                char key = s.charAt(i);
                map.put(key, Math.min(i + 1, map.getOrDefault(key, Integer.MAX_VALUE)));
            }
        }
        for (int i = 0; i < targets.length; i++) {
            String s = targets[i];
            for (int j = 0; j < s.length(); j++) {
                char key = s.charAt(j);
                if (map.containsKey(key)) {
                    answer[i] += map.get(key);
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}