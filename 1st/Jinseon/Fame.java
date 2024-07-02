import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> top = new ArrayList<Integer>();
        for(int i = 0; i < score.length; i++){
            top.add(score[i]);
            if(top.size() > k){
                top.remove(Collections.min(top));
            }
            answer[i] = Collections.min(top);
        }
        return answer;
    }
}