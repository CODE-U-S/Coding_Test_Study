class Solution {
    public long solution(long n) {
        long answer = 0;
        for (int i = 1; i < 50; i++) {
            if (i * i == n) {
                answer = (i + 1) * (i + 1);
            }
        }
        if (answer == 0) {
            answer = -1;
        }
        return answer;
    }
}