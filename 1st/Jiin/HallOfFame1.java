import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] hall_of_fame = new int[k]; // 명예의 전당
        int[] answer = new int[score.length];
        Arrays.fill(hall_of_fame, -1); // 점수가 0일 경우 대비
        
        for(int i = 0; i < score.length; i++){
            
            if(hall_of_fame[0] < score[i]){
                hall_of_fame[0] = score[i];
                Arrays.sort(hall_of_fame);
            }
            
            for(int hall : hall_of_fame){
                if(hall == -1) continue;
                else{
                    answer[i] = hall;
                    break;
                }//else
            }// inner for
            
        }// outter for
        
        return answer;
    }
}
