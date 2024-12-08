import java.util.*;

class Solution {
    public int solution(int[][] scores) {
        int answer = 1;
        List<int[]> index = new ArrayList<>();
        
        //완호보다 높은 사원 걸러내기
        for(int i = 1; i < scores.length; i++){
            if(scores[0][0] < scores[i][0] && scores[0][1] < scores[i][1]){
                //완호의 두 점수가 낮으면 인센티브 못 받음
                return -1;
            }else if(scores[0][0]+scores[0][1] < scores[i][0]+scores[i][1]){
                //완호보다 높은 수
                index.add(scores[i]);
            }
        }
        
        answer += index.size();
        
        //정렬
         Collections.sort(index, (o1, o2) -> {
            int sum1 = o1[0] + o1[1];
            int sum2 = o2[0] + o2[1];
            if (sum1 != sum2) {
                return sum1 - sum2;
            } else {
                return o1[0] - o2[0];
            }
        });

        for(int i = 0; i < index.size(); i++){
            int[] score1 = index.get(i);
            
            for(int j = index.size() - 1; j > i; j--){
                int[] score2 = index.get(j);
                if(score1[0] < score2[0] && score1[1] < score2[1]){
                    answer--;
                    break;
                }
            }
        }
        
        return answer;
    }
}
