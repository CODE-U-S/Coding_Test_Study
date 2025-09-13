class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        for (int  i = 0; i < share; i++) {
            answer *= balls - i;
            answer /= i + 1;
        }
        return answer;
    }
}