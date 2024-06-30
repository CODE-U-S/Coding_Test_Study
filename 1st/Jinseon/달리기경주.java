import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        int num = players.length;
        Map<String, Integer> rank = new HashMap<>();
        
        for (int i=0; i< num ; i++) {
            rank.put(players[i], i);
        }
        
        for (String player : callings) {
            int playerRanking = rank.get(player);
            String front = players[playerRanking-1];
            
            rank.replace(front, playerRanking);
            players[playerRanking] = front;
            
            rank.replace(player, playerRanking-1);
            players[playerRanking-1] = player; 
        }
        return players;
    }
}