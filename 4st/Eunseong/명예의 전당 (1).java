import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            a.add(score[i]);
            Collections.sort(a);
            answer[i] = a.get(Math.max(i + 1 - k, 0));
        }
        
        return answer;
    }
}