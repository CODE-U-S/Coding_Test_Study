class Solution {
    public int solution(int n) {
        int answer = ((n == 0) ? 0 : (n == 1) ? 1 : n + 1);
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}