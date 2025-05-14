class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        for (int i = 0; hp >= 5; i++) {
            hp -= 5;
            answer++;
        }
        for (int i = 0; hp >= 3; i++) {
            hp -= 3;
            answer++;
        }
        for (int i = 0; hp >= 1 ; i++) {
            hp -= 1;
            answer++;
        }
        
        return answer;
    }
}