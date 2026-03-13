class Solution {
    public long solution(int n) {
        long m = 0;
        long answer = 1;
        for (int i = 0; i < n; i++) {
            answer = answer + m;
            m = answer - m;
            answer %= 1234567;
            m %= 1234567;
        }
        return answer % 1234567;
    }
}