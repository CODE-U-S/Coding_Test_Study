import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothMap = new HashMap<>();
        int answer = 1;
        
        for (int i = 0; i < clothes.length; i++) {
            clothMap.put(clothes[i][1], clothMap.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        for (int i : clothMap.values()) {
            answer *= i + 1;
        }
        
        return answer - 1;
    }
}