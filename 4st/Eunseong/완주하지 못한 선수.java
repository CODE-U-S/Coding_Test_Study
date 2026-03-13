import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hs = new HashMap<>();
        for (String i : participant) {
            hs.put(i, hs.getOrDefault(i, 0) + 1);
        }
        for (String i : completion) {
            hs.put(i, hs.get(i) - 1);
        }
        for (String i : hs.keySet()) {
            if (hs.get(i) == 1) {
                return i;
            }
        }
        
        return "";
    }
}