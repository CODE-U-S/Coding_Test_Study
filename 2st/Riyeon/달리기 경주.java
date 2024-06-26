import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0; i<players.length; i++){
            hm.put(players[i], i);
        }
        
        for(String s : callings){
            int n = hm.get(s);
            String p = players[n-1];
            players[n-1] = s;
            players[n] = p;
            hm.put(s, n-1);
            hm.put(p, n);
        }
        return players;
    }
}