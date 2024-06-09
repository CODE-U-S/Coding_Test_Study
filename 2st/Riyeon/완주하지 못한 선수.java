import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap();
        for(String s : participant){
            if(hm.get(s) != null)
                hm.put(s, hm.get(s)+1);
            else
                hm.put(s, 1);
        }
        for(String s : completion){
            if(hm.get(s) != null)
                hm.put(s, hm.get(s)-1);
        }
        for(String key : hm.keySet())
            if(hm.get(key) != 0)
                answer = key;
        return answer;
    }
}