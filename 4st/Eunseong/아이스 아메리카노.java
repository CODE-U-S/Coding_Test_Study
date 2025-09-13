class Solution {
    public int[] solution(int money) {
        int[] answer = {0, 0};
        
        for (int i = 0; money >= 5500; i++) {
            if (money >= 5500) {
                answer[0] += 1;
                money -= 5500;
            }
        }
        answer[1] = money;
        
        return answer;
    }
}