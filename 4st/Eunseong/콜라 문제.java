class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int cnt = n / a;
            int newCola = cnt * b;
            answer += newCola;
            n = newCola + (n % a);
        }

        return answer;
    }
}