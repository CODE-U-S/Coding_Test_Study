class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        for (int i = 1; i < 10; i++) {
            if (number % n == 0 && number % m == 0)
                answer = 1;
            else 
                answer = 0;
        }
        return answer;
    }
}