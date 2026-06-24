import java.util.*;

class Solution {
    public int[] solution(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int n = c - '0';
                i++;
                while (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    n = n * 10 + s.charAt(i++) - '0';
                }
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
        }
        
        int[] answer = new int[map.size()];
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((o1, o2) -> {
            return map.get(o2) - map.get(o1);
        });
        for (int i = 0; i < answer.length; i++) {
            answer[i] = keys.get(i);
        }
        
        return answer;
    }
}
// Map으로 갯수세고
// 많은거 -> 적은거순으로 배열에 넣기