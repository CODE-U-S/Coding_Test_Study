import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i=0;i< players.length;i++)
            map.put(players[i],i);

        for(String calling : callings)
        {
            int count = map.get(calling);
            String temp = answer[count-1];
            answer[count-1] = calling;
            answer[count] = temp;
            map.put(calling,count-1);
            map.put(temp,count);
        }

        return answer;
    }
}