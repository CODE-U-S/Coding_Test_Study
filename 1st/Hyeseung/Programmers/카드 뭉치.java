import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        
        for(String card : cards1) { q1.offer(card); }
        for(String card: cards2) { q2.offer(card); }
        
        for(String g : goal) {
            if(!q1.isEmpty() && g.equals(q1.peek())) q1.poll();
            else if(!q2.isEmpty() && g.equals(q2.peek())) q2.poll();
            else return "No";
        }
        
        return "Yes";
    }
}