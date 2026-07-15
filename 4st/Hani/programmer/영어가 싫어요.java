import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        Map<String, Integer> map = new HashMap<>();
        
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("zero", 0);
        
        String temp = "";
        
        for (int i = 0; i < numbers.length(); i++) {
            char c = numbers.charAt(i);
            temp += c;
            if (map.containsKey(temp)) {
                answer = answer * 10 + map.get(temp);
                temp = "";
            }
        }
        
        return answer;
    }
}