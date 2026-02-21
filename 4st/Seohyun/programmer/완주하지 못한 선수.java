import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String name : participant) {    //참가자 명단
            map.put(name, map.getOrDefault(name, 0)+1);
        }
        
        for(String name : completion) {     //완주자 명단
            map.put(name, map.get(name)-1);
        }
        
        for(String name : map.keySet()) {
            if(map.get(name) != 0) {
                return name;
            }
        }
        return "";
    }
}