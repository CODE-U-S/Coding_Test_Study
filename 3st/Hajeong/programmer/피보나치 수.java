class Solution {
    public int solution(int n) {
        // if(n == 2)
        // return 1;
        // return solution(n-2)+solution(n-1) % 1234567;

        int n1 = 1;
        int n2 = 0;
        int answer = 0;
        for (int i = 1; i < n; i++) {
            answer = (n1 + n2) % 1234567;
            n2 = n1;
            n1 = answer;
        }
        return answer;
    }
}