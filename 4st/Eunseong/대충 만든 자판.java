import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> keyCnt = new HashMap<>();
        int[] answer = new int[targets.length];
        
        for (String s : keymap) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (keyCnt.containsKey(c)) {
                    if (keyCnt.get(c) > i + 1) {
                        keyCnt.put(c, i + 1);
                    }
                } else {
                    keyCnt.put(c, i + 1);
                }
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            for (char c : targets[i].toCharArray()) {
                if (keyCnt.containsKey(c)) {
                    answer[i] += keyCnt.get(c);
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}