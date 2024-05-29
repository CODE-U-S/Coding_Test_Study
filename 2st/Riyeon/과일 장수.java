import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;
        for(int i=1; i <= score.length/m; i++){
            answer += score[score.length - (m*i)] * m;
        }
        return answer;
    }
}