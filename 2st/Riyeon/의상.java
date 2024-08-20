import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1)+1);
        }
        Set<String> key = new HashSet<>(map.keySet());
        for(String s : key)
            answer *= map.get(s);
        return answer-1;
    }
}