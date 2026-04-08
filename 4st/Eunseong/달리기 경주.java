import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        int answer[] = new int[players.length];
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        for (String s : callings) {
            String temp = players[map.get(s)];
            players[map.get(s)] = players[map.get(s) - 1];
            players[map.get(s) - 1] = temp;
            map.put(players[map.get(s)], map.get(s));
            map.put(temp, map.get(s) - 1);
        }
        return players;
    }
}