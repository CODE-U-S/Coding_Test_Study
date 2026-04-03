class Solution {
    public int solution(int n, int a, int b) {
        int answer = 1;
        while (true) {
            if (Math.abs(a - b) == 1) {
                if ((a > b && a % 2 == 0) || (b > a && b % 2 == 0)) {
                    break;
                }
            }
            a = (int)Math.ceil((double)a / 2);
            b = (int)Math.ceil((double)b / 2);
            answer++;
        }
        return answer;
    }
}