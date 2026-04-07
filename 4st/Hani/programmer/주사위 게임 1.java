class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 == 1 && b % 2 == 1) {
            answer = (a * a) + (b * b);
        } else if (a % 2 == 1 || b % 2 == 1) {
            answer = 2 * (a + b);
        } else if (a % 2 == 0 && b % 2 == 0) {
            answer = a - b;
            if (answer < 0) {
                answer = -1 * answer;
            }
        }
        return answer;
    }
}