class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int count = 0;
        int attacks_count = 0;
        int time = 0;
        while(true){
            if(attacks[attacks_count][0] == time){
                count = 0;
                answer -= attacks[attacks_count][1];
                attacks_count++;
                if(answer <= 0) return -1;
            } else {
                answer += bandage[1];
                count++;
                if(count == bandage[0]){ //추가 회복량 계산
                    answer += bandage[2];
                    count = 0;
                }
                if(answer > health) answer = health;
            }
            if(time == attacks[attacks.length - 1][0]) break;
            time++;
        }
        return answer;
    }
}