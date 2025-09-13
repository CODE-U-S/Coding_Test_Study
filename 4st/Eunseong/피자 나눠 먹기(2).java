class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; (6 * i) % n != 0; i++) {
            answer = i;
        }
        answer++;
        
        return answer;
    }
}