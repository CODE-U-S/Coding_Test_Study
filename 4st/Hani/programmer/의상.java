import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            
            if (map.containsKey(type)) {
                map.put(type, map.get(type) + 1);
            } else {
                map.put(type, 1);
            }
        }
        
        
        int answer = 1;
        for (int value : map.values()) {
            answer *= (value + 1);
        }
        
        return answer-1;
    }
}