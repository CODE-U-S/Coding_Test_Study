import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] solution(String msg) {
        HashMap<String, Integer> dict = new HashMap<>();
        ArrayList<Integer> answerList = new ArrayList<>();
        StringBuilder s = new StringBuilder(msg);
        for (int i = 1; i <= 26; i++) {
            dict.put(Character.toString('A' - 1 + i), i);
        }
        
        int len = 1;
        int curN = 27;
        
        while (s.length() >= len) {
            if (dict.containsKey(s.substring(0, len))) {
                len++;
            } else {
                answerList.add(dict.get(s.substring(0, len - 1)));
                if (len <= s.length()) {
                    dict.put(s.substring(0, len), curN++);
                    s.delete(0, len - 1);
                }
                len = 1;
            }
        }
        answerList.add(dict.get(s.toString()));
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}