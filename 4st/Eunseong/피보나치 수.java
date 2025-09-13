class Solution {
    public long solution(int n) {
        long answer = 0;
        long num = 1;
        
        for (int i = 0; i < n; i++) {
            num += answer;
            answer = num - answer;
            n %= 1234567;
            answer %= 1234567;
        }
        
        return answer % 1234567;
    }
}