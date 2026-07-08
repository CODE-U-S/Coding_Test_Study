import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();
            map.put(len, map.getOrDefault(len, 0) + 1);
        }
        
        int count = 0;
        for (int value : map.values()) {
            if (value > count) {
                count = value;
            }
        }
        
        return count;
    }
}