class Solution {
    public int solution(int n) {
        int answer = 2;
        for (int i = 0; i < n / 2; i++) {
            if (i * i == n) {
                return answer = 1;
            }
        }
        return answer;
    }
}