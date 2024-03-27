class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a % 2 == 1){
            if(b % 2 == 1){
                answer = a*a + b*b;
            } else {
                answer = 2 * (a + b);
            }
        } else {
            if(b % 2 == 1){
                answer = 2 * (a + b);
            } else {
                answer = a > b ? a-b : b-a;
            }
        }
        return answer;
    }
}
